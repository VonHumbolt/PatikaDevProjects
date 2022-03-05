using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;
using WebApi.DBOperations;
using WebApi.BookOperations.GetBooks;
using WebApi.BookOperations.CreateBooks;
using System;
using FluentValidation;
using AutoMapper;

namespace WebApi.AddControllers{

    [ApiController]
    [Route("[controller]s")]
    public class BookController : ControllerBase {
        
        private readonly BookStoreDbContext _context;
        private readonly IMapper _mapper;
        public BookController(BookStoreDbContext context, IMapper mapper) {
            _context = context;
            _mapper = mapper;
        }
        
        [HttpGet]
        public IActionResult GetBooks() {
            GetBooksQuery  query = new GetBooksQuery(_context, _mapper);
            var result = query.Handle();

            return Ok(result);
        }

        [HttpGet("{id}")]
        public IActionResult GetById(int id) {
            GetBookQuery query = new GetBookQuery(_context, _mapper);
            var result = query.Handle(id);

            return Ok(result);
        }

        [HttpPost]
        public IActionResult AddBook([FromBody] CreateBookModel newBook){
            CreateBookCommand command = new CreateBookCommand(_context, _mapper);
            try
            {
                command.Model = newBook;
                CreateBookCommandValidator validator = new CreateBookCommandValidator();
                validator.ValidateAndThrow(command);
                
                command.Handle();
                
            }
            catch (Exception ex)
            {
                
                return BadRequest(ex.Message);
            }
            return Ok();
        }
        
        [HttpPut("{id}")]
        public IActionResult UpdateBook(int id, [FromBody] UpdateBookModel model){
            
            UpdateBookCommand command = new UpdateBookCommand(_context);

            try
            {
                UpdateBookCommandValidator validator = new UpdateBookCommandValidator();
                validator.ValidateAndThrow(model);

                command.Handle(id, model);
            }
            catch (System.Exception ex)
            {
                return BadRequest(ex.Message);
            }

            return Ok();

        }

        [HttpDelete("{id}")]
        public IActionResult DeleteBook(int id) {
            var book = _context.Books.SingleOrDefault(x => x.Id == id);

            if (book is null) 
                return BadRequest();

            _context.Books.Remove(book);
            _context.SaveChanges();
            return Ok();
        }
    }
}