create database if not exists db_pesquisa;  

use db_pesquisa;

create table if not exists tb_ruidos(
	id int primary key auto_increment,
    nivel int not null,
constraint fk_nivel_id foreign key (nivel_id) references ruidos(nivel)
)auto_increment=1;

create table if not exists tb_cruzamento(
	id int primary key auto_increment,
    endereco varchar(255) not null,
    nome varchar(255) not null
)auto_increment=1;

create table if not exists tb_nivel(
	id int primary key auto_increment,
    horario datetime not null,
	nivel int not null,
constraint fk_nivel_id foreign key(nivel_id) references ruidos(nivel)
)auto_increment=1;
	
insert into tb_