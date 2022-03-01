using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;
using WebApi.DBOperations;
using WebApi.BookOperations.GetBooks;
using WebApi.BookOperations.CreateBooks;
using System;

namespace WebApi.AddControllers{

    [ApiController]
    [Route("[controller]s")]
    public class BookController : ControllerBase {
        
        private readonly BookStoreDbContext _context;

        public BookController(BookStoreDbContext context) {
            _context = context;
        }
        
        [HttpGet]
        public IActionResult GetBooks() {
            GetBooksQuery  query = new GetBooksQuery(_context);
            var result = query.Handle();

            return Ok(result);
        }

        [HttpGet("{id}")]
        public IActionResult GetById(int id) {
            GetBookQuery query = new GetBookQuery(_context);
            var result = query.Handle(id);

            return Ok(result);
        }

        [HttpPost]
        public IActionResult AddBook([FromBody] CreateBookModel newBook){
            CreateBookCommand command = new CreateBookCommand(_context);
            try
            {
                command.Model = newBook;
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