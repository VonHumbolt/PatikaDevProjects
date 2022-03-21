using AutoMapper;
using System;
using WebApi.BookOperations.CreateBooks;
using WebApi.BookOperations.GetBooks;

namespace WebApi.Common
{
	public class MappingProfile : Profile
	{
		public MappingProfile()
		{
			CreateMap<CreateBookModel, Book>(); // CreateBookModel objesi Book objesine maplenebilir demek!
			CreateMap<Book, BookViewModel>().ForMember(dest => dest.Genre, opt => opt.MapFrom(src => ((GenreEnum)src.GenreId).ToString()));
		}
	}

}
