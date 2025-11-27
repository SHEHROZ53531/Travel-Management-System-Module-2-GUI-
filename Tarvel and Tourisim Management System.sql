create database travelmanagementsystem1;
show databases;
use travelmanagementsystem1;

create table account (username varchar(20), name varchar(20), password varchar(20), security varchar(100), answer varchar(50));
show tables;
select * from account;

create table customer (username varchar(20), id varchar(20), number varchar(30), name varchar(30), gender varchar(20), country varchar(30), address varchar(50), phone varchar(20), email varchar(40));
select * from customer;

create table bookpackage( username varchar(20), package varchar(30), persons varchar(20), id varchar(30), number varchar(30), phone varchar(20), price varchar(20));
select * from bookpackage;

create table hotel (name varchar(30), costperperson varchar(20), acroom varchar(10), foodincluded varchar(10));
INSERT INTO hotel VALUES ('Serena Gilgit', '7500' , '1000', '1700');
INSERT INTO hotel VALUES ('Hunza View Hotel', '4000', '2500', '3000');
INSERT INTO hotel VALUES ('Kunhar Guest House', '2500', '3800','4000');
INSERT INTO hotel VALUES ('Shangrila Resort', '12000', '5000','5500');

select * from hotel;

create table bookhotel(username varchar(20), name varchar(20), persons varchar(10), days varchar(10), ac varchar(10), food varchar(10), id varchar(30),  number varchar(20), phone varchar(20), price varchar(20));



