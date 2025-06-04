create database if not exists db_login;
drop database db_login;
use db_login;
create table  if not exists Pessoa(
	id int primary key auto_increment not null,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    sexo varchar(50) not null,
    cpf char(12) not null,
    curso varchar(100) not null,
    matricula varchar(30) not null
)auto_increment=1;

select * from Pessoa;