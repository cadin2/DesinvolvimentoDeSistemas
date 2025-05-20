create database if not exists Comercio;
use Comercio;

create table if not exists Padoca(
	id int primary key auto_increment,
    nome varchar(20),
    email varchar(50),
    telefone char(11),
    tipo varchar(20)
)auto_increment=1;