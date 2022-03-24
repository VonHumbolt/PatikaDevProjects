select count(*) from film 
where length > (
	select avg(length) from film
);

select count(*) from film 
where rental_rate = (
	select max(rental_rate) from film
);

select * from film 
where rental_rate=(
	select min(rental_rate) from film
) and replacement_cost = (
	select min(replacement_cost) from film
);

select payment.customer_id, first_name, last_name, count(payment.customer_id) from payment
left join customer on payment.customer_id = customer.customer_id
group by payment.customer_id, customer.first_name, customer.last_name
order by count(payment.customer_id) desc;
