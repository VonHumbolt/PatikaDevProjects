using System.Collections.Generic;
using WebApi.DBOperations;
using System.Linq;
using System;
using WebApi.Common;

namespace WebApi.BookOperations.GetBooks
{
    public class GetBooksQuery
    {
        private readonly BookStoreDbContext _dbContext;
        public GetBooksQuery(BookStoreDbContext dbContext)
        {
            _dbContext = dbContext;
        }

        public List<BookViewModel> Handle() {
            var bookList = _dbContext.Books.OrderBy(x => x.Id);
            List<BookViewModel> vm = new List<BookViewModel>();
            foreach (var item in bookList)
            {
                vm.Add(new BookViewModel() {
                    Title = item.Title,
                    Genre = ((GenreEnum)item.GenreId).ToString(),
                    PageCount = item.PageCount,
                    PublishedDate = item.PublishDate.Date.ToString("dd/MM/yyyy")
                });
            }
            return vm;
        } 


    }
        public class BookViewModel {
            public string Title { get; set; }
            public int PageCount { get; set; }
            public string PublishedDate { get; set; }
            public string Genre { get; set; }
        }
}