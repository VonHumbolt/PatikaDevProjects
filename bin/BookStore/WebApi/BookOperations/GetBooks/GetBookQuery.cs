using System.Collections.Generic;
using WebApi.DBOperations;
using System.Linq;
using System;
using WebApi.Common;
using AutoMapper;

namespace WebApi.BookOperations.GetBooks
{
    public class GetBookQuery
    {
        private readonly BookStoreDbContext _dbContext;
        private readonly IMapper _mapper;
        public GetBookQuery(BookStoreDbContext dbContext, IMapper mapper)
        {
            _dbContext = dbContext;
            _mapper = mapper;
        }

        public BookViewModel Handle(int id) {
            var book = _dbContext.Books.FirstOrDefault(x => x.Id == id); 
            
            if (book is null) {
                throw new InvalidOperationException("Kitap Bulunamadý");
                
            }

            BookViewModel vm = _mapper.Map<BookViewModel>(book);

            //vm.Title = book.Title;
            //vm.Genre = ((GenreEnum)book.GenreId).ToString();
            //vm.PageCount = book.PageCount;
            //vm.PublishedDate = book.PublishDate.Date.ToString("dd/MM/yyyy");

            return vm;
        } 


    }
}