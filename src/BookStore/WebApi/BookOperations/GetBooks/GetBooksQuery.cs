using System.Collections.Generic;
using WebApi.DBOperations;
using System.Linq;
using System;
using WebApi.Common;
using AutoMapper;

namespace WebApi.BookOperations.GetBooks
{
    public class GetBooksQuery
    {
        private readonly BookStoreDbContext _dbContext;
        private readonly IMapper _mapper;
        public GetBooksQuery(BookStoreDbContext dbContext, IMapper mapper)
        {
            _dbContext = dbContext;
            _mapper = mapper;
        }

        public List<BookViewModel> Handle() {
            var bookList = _dbContext.Books.OrderBy(x => x.Id);
            List<BookViewModel> vm = _mapper.Map<List<BookViewModel>>(bookList);
            //foreach (var item in bookList)
            //{
            //    vm.Add(new BookViewModel() {
            //        Title = item.Title,
            //        Genre = ((GenreEnum)item.GenreId).ToString(),
            //        PageCount = item.PageCount,
            //        PublishedDate = item.PublishDate.Date.ToString("dd/MM/yyyy")
            //    });
            //}
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