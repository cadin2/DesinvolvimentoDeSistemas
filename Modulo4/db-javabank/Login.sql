create database if not exists db_login;
drop database login;
use db_login;
create table if not exists Pessoa(
	id int primary key auto_increment,
    nome varchar(20),
    endereco varchar(20),
    sexo varchar(10),
    cpf char(13)
)auto_increment=1;

select * from Pessoa;