-- user : root
-- pass : root
create database user_hib;
use user_hib;

drop table access;
drop table user;

create table user(
    email varchar(50) primary key,
    name varchar(50),
    lastname varchar(50),
    enterprise varchar(50),
    registerdate varchar(50)
);

create table access(
	email varchar(50),
    date varchar(50),
    time varchar(50),
    PRIMARY KEY (email, date, time),
    FOREIGN KEY (email) REFERENCES user(email)
);

-- insert into user values ('michael@gmail.com', 'michael', 
-- 'salinas', 'megaautos', '05/06/2018');

-- insert into access values ('michael@gmail.com', '05/06/2018', '23:14:15');

-- select * from user;
-- select * from access;

-- truncate access;
-- truncate user;

-- SET FOREIGN_KEY_CHECKS = 0; 
-- TRUNCATE table user; 
-- SET FOREIGN_KEY_CHECKS = 1


