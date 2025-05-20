create database if not exists Concessionaria;
use Concessionaria;

create table if not exists Carro(
	id int primary key auto_increment,
    marca varchar(20),
    tipo varchar(20),
    ano int,
    porta int
)auto_increment=1;

select * from Carro;