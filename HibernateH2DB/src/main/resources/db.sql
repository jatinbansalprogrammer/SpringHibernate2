create table student (
id int not null AUTO_INCREMENT,
first_name varchar ,
last_name varchar,
email varchar,
address_id varchar,
primary key(id)
);

create table address (
id int not null AUTO_INCREMENT,
city varchar,
primary key(id)
);

