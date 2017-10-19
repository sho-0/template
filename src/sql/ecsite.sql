drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
theme varchar(30),
item_price int(11),
comment varchar (100),
img varchar (100) null default null,
insert_date datetime,
update_date datetime
);

drop table if exists credit;

create table credit(
id int not null primary key auto_increment,
name_e varchar(50),
credit_number varchar (16),
security_code varchar (4),
id_number varchar (4),
insert_date datetime,
update_date datetime
);

INSERT INTO item_info_transaction(item_name,theme,item_price,comment,img)
VALUES
("観光","map",2000,"観光に特化した、地図アプリになります。","img/kankou.jpg"),
("走行","map",2000,"走る楽しみに特化した、地図アプリになります。","img/soukou.jpg"),
("完全","map",4000,"観光地図アプリと走行地図アプリ、両方を合わせたアプリとなります。","img/kanzen.jpg");

INSERT INTO credit(name_e,credit_number,security_code,id_number)
VALUES
("sample1","1111111111111111","1111","1111"),
("sample2","2222222222222222","2222","2222"),
("sample3","3333333333333333","3333","3333");