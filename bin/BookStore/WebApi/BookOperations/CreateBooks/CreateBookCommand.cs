using System.Collections.Generic;
using WebApi.DBOperations;
using System.Linq;
using System;
using WebApi.Common;
using AutoMapper;

namespace WebApi.BookOperations.CreateBooks
{
    public class CreateBookCommand
    {
        public CreateBookModel Model { get; set; }
        private readonly BookStoreDbContext _dbContext;
        private readonly IMapper _mapper;
        public CreateBookCommand(BookStoreDbContext dbContext, IMapper mapper)
        {
            _dbContext = dbContext;
            _mapper = mapper;
        }

        public void Handle() {
            var book = _dbContext.Books.SingleOrDefault(x => x.Title == Model.Title);
            if (book is not null)
                throw new InvalidOperationException("Kitap zaten mevcut!");

            book = _mapper.Map<Book>(Model);  // new Book();
            //book.Title = Model.Title;
            //book.GenreId = Model.GenreId;
            //book.PageCount = Model.PageCount;
            //book.PublishDate = Model.PublishedDate;

            _dbContext.Books.Add(book);
            _dbContext.SaveChanges();

        }

    }
        public class CreateBookModel {
            public string Title { get; set; }
            public int GenreId { get; set; }
            public int PageCount { get; set; }
            public DateTime PublishDate { get; set; }
        }
}