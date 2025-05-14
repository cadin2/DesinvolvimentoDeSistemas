create database if not exists diariodebordo
charset utf8mb4 collate utf8mb4_general_ci;

use diariodebordo;

create table if not exists aluno(
	id int primary key auto_increment,
    ra int not null,
    nome varchar(255) not null,
    data_nascimento date not null,
    telefone int(13) not null,
    email varchar(255) not null
)auto_increment=1;

create table if not exists materia(
	id int primary key auto_increment,
    materia varchar(255)
)auto_increment=1;

create table if not exists grade(
	id int primary key auto_increment,
    periodo_inicio date,
    periodo_final date
)auto_increment=1;

create table if not exists turma(
	id int primary key auto_increment,
	nome varchar(255)
)auto_increment=1;

create table if not exists diario_bordo(
	id int primary key auto_increment, 
    data_hora datetime,
    texto text
)auto_increment=1;

select * from diario_bordo;