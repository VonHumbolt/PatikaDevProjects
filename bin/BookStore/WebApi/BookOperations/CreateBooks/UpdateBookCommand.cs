using System.Collections.Generic;
using WebApi.DBOperations;
using System.Linq;
using System;
using WebApi.Common;
using WebApi.BookOperations.CreateBooks;

namespace WebApi.BookOperations.CreateBooks
{
    public class UpdateBookCommand
    {
        private readonly BookStoreDbContext _dbContext;
        public UpdateBookCommand(BookStoreDbContext dbContext)
        {
            _dbContext = dbContext;
        }

        public void Handle(int id, UpdateBookModel model) {
            var book = _dbContext.Books.FirstOrDefault(x => x.Id == id);
            if (book == null) {
                throw new InvalidOperationException("Kitap Bulunamadı");
            }
            book.Title = model.Title != default ? model.Title : book.Title;
            book.GenreId = model.GenreId != default ? model.GenreId : book.GenreId;
            book.PageCount = model.PageCount != default ? model.PageCount : book.PageCount;
            book.PublishDate = model.PublishedDate != default ? model.PublishedDate : book.PublishDate;

            _dbContext.SaveChanges();

        }
    }

    public class UpdateBookModel{
        public string Title { get; set; }
        public int GenreId { get; set; }
        public int PageCount { get; set; }
        public DateTime PublishedDate { get; set; }
    }
}