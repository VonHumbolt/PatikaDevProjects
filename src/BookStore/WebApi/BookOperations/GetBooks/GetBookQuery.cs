using System.Collections.Generic;
using WebApi.DBOperations;
using System.Linq;
using System;
using WebApi.Common;

namespace WebApi.BookOperations.GetBooks
{
    public class GetBookQuery
    {
        private readonly BookStoreDbContext _dbContext;
        public GetBookQuery(BookStoreDbContext dbContext)
        {
            _dbContext = dbContext;
        }

        public BookViewModel Handle(int id) {
            var book = _dbContext.Books.FirstOrDefault(x => x.Id == id); 
            BookViewModel vm = new BookViewModel();
            if (book != null) {
                vm.Title = book.Title;
                vm.Genre = ((GenreEnum)book.GenreId).ToString();
                vm.PageCount = book.PageCount;
                vm.PublishedDate = book.PublishDate.Date.ToString("dd/MM/yyyy");
            }

            return vm;
        } 


    }
}