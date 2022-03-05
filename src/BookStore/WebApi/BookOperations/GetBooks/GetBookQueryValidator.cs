using FluentValidation;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApi.BookOperations.GetBooks
{
    public class GetBookQueryValidator : AbstractValidator<BookViewModel>
    {
        public GetBookQueryValidator()
        {
            
        }
    }
}
