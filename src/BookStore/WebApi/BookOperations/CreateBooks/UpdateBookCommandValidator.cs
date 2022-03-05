using FluentValidation;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApi.BookOperations.CreateBooks
{
    public class UpdateBookCommandValidator : AbstractValidator<UpdateBookModel>
    {
        public UpdateBookCommandValidator()
        {
            RuleFor(model => model.GenreId).GreaterThan(0);
        }
    }
}
