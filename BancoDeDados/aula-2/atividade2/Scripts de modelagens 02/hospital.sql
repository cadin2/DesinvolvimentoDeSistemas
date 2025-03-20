-- Active: 1739469240487@@127.0.0.1@3306@db_hospital
create database if not exists db_hospital
CHARSET utf8mb4 COLLATE utf8mb4_general_ci;

use db_hospital;

create table if not exists tb_especialidade(
	id int primary key auto_increment,
    descricao varchar(255)
)auto_increment=1;

create table if not exists tb_paciente(
	id int primary key auto_increment,
    nome varchar(255) not null
)auto_increment=1;

create table if not exists tb_medico(
	id int primary key auto_increment,
    nome varchar(255) not null,
    id_especialidade int,
constraint fk_especialidade_id foreign key (id_especialidade) references tb_especialidade(id)
)auto_increment=1;

create table if not exists tb_consulta(
	id int primary key auto_increment,
    dt_consulta date,
    id_medico int,
    id_paciente int,
constraint fk_medico_id foreign key (id_medico) references tb_medico(id),
constraint fk_paciente_id foreign key (id_paciente) references tb_paciente(id)
)auto_increment=1;

