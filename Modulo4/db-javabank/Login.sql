create database if not exists db_login;
drop database db_login;
use db_login;
create table  if not exists Pessoa(
	id int primary key auto_increment,
    nome varchar(100),
    endereco varchar(100),
    sexo varchar(50),
    cpf char(12),
    curso varchar(100),
    matricula varchar(30)
)auto_increment=1;

select * from Pessoa;