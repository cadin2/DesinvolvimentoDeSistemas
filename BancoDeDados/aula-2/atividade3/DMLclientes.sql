create database if not exists psul;
use psul;

create table cliente(
	id int primary key auto_increment,
    nome varchar(60)
)auto_increment=1;

-- tipos de sql
-- ddl(data definitionlenguage)
-- create,alter, drop
-- dml
-- insert, delete,update
-- dql
-- select, join, where, funções etc... filtros
-- dcl
-- comandos de adm
-- dtl 
-- transação, commit ou rollback
-- funções e ou precedimentos
-- functions e procedures
-- programação pesada
-- triggers
-- gatilhos

-- conexão com database
-- flask com SQLAlchemy- mysql (enteder a conexão, camadas)
-- django crud com orm(completo)

drop database psul;
create database if not exists salasenai;
use salasenai;

create table if not exists cliente(
	id int primary key auto_increment,
    nome varchar(255) not null,
    fone char(13),
    email varchar(30) unique not null,
    senha varchar (255) not null
)auto_increment=1;

describe cliente;

insert	into cliente(nome,fone,email,senha)
values('lucas','2004-2435','lukinhasmetelao20@gmail.com','244466666'),
('guilerme','9012-3213','guilermaarana@gmail.com','40028922'),
('matheus','2390-8734','matheusito2017@gmail.com','12345751'),
('phillipes','2586-9635','philipespes@gmail.com','45683215'),
('rodrigao','7894-2685','rodrigueira@gmail.com','75329514'),
('karina','6884-1765','karina@gmail.com','486557542'),
('bruno','4567-1236','boanoitebruno@gmail.com','123519483');

SELECT*FROM cliente;
