CREATE TABLE customers (
    id integer primary key auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    street varchar(255),
    zip_code varchar(255),
    city varchar(255)
);