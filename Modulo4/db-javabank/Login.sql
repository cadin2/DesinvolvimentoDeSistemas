create database if not exists Login;
drop database login;
use Login;
create table if not exists Pessoa(
	id int primary key auto_increment,
    nome varchar(20),
    endereco varchar(20),
    sexo varchar(10),
    cpf char(13)
)auto_increment=1;

select * from Pessoa;