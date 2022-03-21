/* Database Oluşturuldu!

CREATE TABLE employee(
	id Serial PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);
*/

/* Elemanlar Eklendi!
	insert into employee (name, birthday, email) values ('Ahmed Loraine', '1911-12-09', 'aloraine0@unicef.org');
insert into employee (name, birthday, email) values ('Linette Middle', null, null);
insert into employee (name, birthday, email) values ('Innis Duester', '1931-09-24', 'iduester2@barnesandnoble.com');
insert into employee (name, birthday, email) values ('Archibald Rake', '1962-03-18', 'arake3@nydailynews.com');
insert into employee (name, birthday, email) values ('Devonne Brimner', '1910-04-19', 'dbrimner4@about.com');
insert into employee (name, birthday, email) values ('Rodolfo Cobain', '1964-03-09', 'rcobain5@psu.edu');
insert into employee (name, birthday, email) values ('Florenza Shovell', null, 'fshovell6@miibeian.gov.cn');
insert into employee (name, birthday, email) values ('Lou Presshaugh', '1942-01-23', 'lpresshaugh7@jalbum.net');
insert into employee (name, birthday, email) values ('Laetitia Scurfield', null, null);
insert into employee (name, birthday, email) values ('Wendel Walsh', null, 'wwalsh9@statcounter.com');
insert into employee (name, birthday, email) values ('Ambrosius Yosevitz', '1962-07-08', 'ayosevitza@uol.com.br');
insert into employee (name, birthday, email) values ('Richmond Gambles', '1942-01-12', 'rgamblesb@arstechnica.com');
insert into employee (name, birthday, email) values ('Benoit Estevez', '2004-02-01', 'bestevezc@mashable.com');
insert into employee (name, birthday, email) values ('Eryn Lindsey', '1907-07-10', 'elindseyd@ucoz.com');
insert into employee (name, birthday, email) values ('Florinda Cino', '1969-07-01', 'fcinoe@fda.gov');
insert into employee (name, birthday, email) values ('Abie Guyer', '1997-02-03', 'aguyerf@creativecommons.org');
insert into employee (name, birthday, email) values ('Hobie Instrell', '1974-06-06', 'hinstrellg@people.com.cn');
insert into employee (name, birthday, email) values ('Yard Brigman', '2007-08-09', null);
insert into employee (name, birthday, email) values ('Alfie Pocock', '2002-02-19', 'apococki@booking.com');
insert into employee (name, birthday, email) values ('Charmian Michele', null, 'cmichelej@ameblo.jp');
insert into employee (name, birthday, email) values ('Gussy Dunge', '1986-07-25', 'gdungek@tamu.edu');
insert into employee (name, birthday, email) values ('Ilario Siaskowski', null, 'isiaskowskil@scribd.com');
insert into employee (name, birthday, email) values ('Douglass Hanning', '2004-05-12', null);
insert into employee (name, birthday, email) values ('Maridel Borthe', '2013-05-17', null);
insert into employee (name, birthday, email) values ('Vera Mennear', '1989-04-16', 'vmennearo@google.es');
insert into employee (name, birthday, email) values ('Trip Kensy', '1959-05-09', 'tkensyp@ehow.com');
insert into employee (name, birthday, email) values ('Maryann Consterdine', '2001-10-08', 'mconsterdineq@cnet.com');
insert into employee (name, birthday, email) values ('Orrin Grodden', '1982-08-25', 'ogroddenr@ca.gov');
insert into employee (name, birthday, email) values ('Garrik Poad', '1962-05-25', 'gpoads@comcast.net');
insert into employee (name, birthday, email) values ('Marven Isard', '1928-01-12', 'misardt@tinypic.com');
insert into employee (name, birthday, email) values ('Ewan Andrelli', '1926-12-15', 'eandrelliu@hc360.com');
insert into employee (name, birthday, email) values ('Gianina McIlmurray', '1946-02-02', 'gmcilmurrayv@sitemeter.com');
insert into employee (name, birthday, email) values ('Melessa Tidcombe', '1989-02-20', 'mtidcombew@telegraph.co.uk');
insert into employee (name, birthday, email) values ('Renado Girvin', '1903-09-20', 'rgirvinx@flavors.me');
insert into employee (name, birthday, email) values ('Joelly Smallpeace', '1905-04-19', 'jsmallpeacey@jugem.jp');
insert into employee (name, birthday, email) values ('Kelbee Breem', null, 'kbreemz@nih.gov');
insert into employee (name, birthday, email) values ('Odetta Idale', '1932-12-23', 'oidale10@hud.gov');
insert into employee (name, birthday, email) values ('Caesar Fowlston', '1952-11-10', 'cfowlston11@ifeng.com');
insert into employee (name, birthday, email) values ('Sephira Alvarado', '1987-10-23', 'salvarado12@stumbleupon.com');
insert into employee (name, birthday, email) values ('Spense Lesper', '1997-09-13', 'slesper13@meetup.com');
insert into employee (name, birthday, email) values ('Jamal Sprionghall', '1919-04-28', 'jsprionghall14@trellian.com');
insert into employee (name, birthday, email) values ('Rodd Dionisetti', '1986-11-25', 'rdionisetti15@hhs.gov');
insert into employee (name, birthday, email) values ('Crissy Grieswood', null, 'cgrieswood16@netlog.com');
insert into employee (name, birthday, email) values ('Rosemaria Mance', '1979-10-17', 'rmance17@cargocollective.com');
insert into employee (name, birthday, email) values ('Gaelan Quickfall', '1927-11-29', 'gquickfall18@mtv.com');
insert into employee (name, birthday, email) values ('Tab Liccardo', '1913-06-20', 'tliccardo19@walmart.com');
insert into employee (name, birthday, email) values ('Buddie Seide', null, 'bseide1a@umich.edu');
insert into employee (name, birthday, email) values ('Kimball Gregorio', '1943-08-25', 'kgregorio1b@pinterest.com');
insert into employee (name, birthday, email) values ('Nicolle Caley', '2016-09-15', 'ncaley1c@dmoz.org');
insert into employee (name, birthday, email) values ('Thoma Haycock', null, 'thaycock1d@rakuten.co.jp');
*/

/* Update İşlemi */
UPDATE employee 
SET name = 'New Name'
WHERE name LIKE 'A%'
RETURNING *;

/* Delete İşlemi */
DELETE FROM employee 
WHERE name = 'New Name'
RETURNING *;
