create table instructor(id integer not null auto_increment, first_name varchar(255), last_name varchar(255), email varchar(255), instrutor_detail_id integer, primary key (id));
create table course(id integer not null auto_increment, title varchar(255), instructor_id integer, primary key (id));
alter table course add constraint  course_instructor foreign key (instructor_id) references instructor(id);

--create table address (id integer not null auto_increment, city varchar(255), country varchar(255), primary key (id))
--create table student (id integer not null auto_increment, email varchar(255), first_name varchar(255), last_name varchar(255), address_id integer, primary key (id));
--alter table student add constraint FKcaf6ht0hfw93lwc13ny0sdmvo foreign key (address_id) references address (id)