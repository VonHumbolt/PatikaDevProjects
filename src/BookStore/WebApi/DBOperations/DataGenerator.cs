using System;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.EntityFrameworkCore;
using System.Linq;

namespace WebApi.DBOperations
{
    public class DataGenerator
    {
        public static void Initialize(IServiceProvider serviceProvider){
            using( var context = new BookStoreDbContext(serviceProvider.GetRequiredService<DbContextOptions<BookStoreDbContext>>())){
                if (context.Books.Any()){
                    return;
                }
                context.Books.AddRange(
                     new Book{
                        
                        GenreId = 1,
                        PageCount = 200,
                        PublishDate = new System.DateTime(2001, 11, 23),
                        Title = "Semerkant"
                    },
                    new Book{
                        GenreId = 1,
                        PageCount = 300,
                        PublishDate = new System.DateTime(1998, 01, 12),
                        Title = "Oliver Twist"
                    },
                    new Book{
                        GenreId = 2,
                        PageCount = 102,
                        PublishDate = new System.DateTime(1420, 02, 12),
                        Title = "Denemeler"
                    }
                );

                context.SaveChanges();
            }
        }
    }
}