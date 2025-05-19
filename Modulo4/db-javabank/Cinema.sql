create database if not exists Cinema;

use Cinema;

create table if not exists Filme(
	id int primary key auto_increment,
    titulo varchar(100),
    genero varchar(50),
    ano date
)auto_increment=1;