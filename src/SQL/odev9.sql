select city, country from city inner join country on country.country_id = city.country_id;

select payment_id, first_name, last_name from payment inner join customer on payment.customer_id = customer.customer_id;

select rental_id, first_name, last_name from rental inner join customer on rental.customer_id = customer.customer_id;
