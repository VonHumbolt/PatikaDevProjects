/* Birleşim */
(
	select first_name from actor
)
union
(
	select first_name from customer
)

/* Kesişim */
(
	select first_name from actor
)
intersect
(
	select first_name from customer
)

/* Except */
(
	select first_name from actor
)
except
(
	select first_name from customer
)

/* Birleşim All */
(
	select first_name from actor
)
union all
(
	select first_name from customer
)

/* Kesişim all */
(
	select first_name from actor
)
intersect
(
	select first_name from customer
)

/* Except all */
(
	select first_name from actor
)
except all
(
	select first_name from customer
)
