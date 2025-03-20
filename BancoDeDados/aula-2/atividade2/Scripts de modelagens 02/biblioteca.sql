create database if not exists db_biblioteca
charset utf8mb4 collate utf8mb4_general_ci;
use db_biblioteca;

create table if not exists tb_autor(
	id int primary key auto_increment,
    nome varchar(255) not null
)auto_increment=1;

create table if not exists tb_usuario(
	id int primary key auto_increment,
    nome varchar(255) not null,
    email varchar(255) not null unique
)auto_increment=1;

create table if not exists tb_livro(
	id int primary key auto_increment,
    titulo varchar(255),
    ano_publi date,
    id_autor int,
constraint fk_autor_id foreign key (id_autor) references tb_autor(id)
)auto_increment=1;

create table if not exists tb_emprestimo(
	id int primary key auto_increment,
    dt_devolucao date,
    dt_emprestimo date,
    id_livro int,
    id_usuario int,
constraint fk_livro_id foreign key (id_livro) references tb_livro(id),
constraint fk_usuario_id foreign key (id_usuario) references tb_usuario(id)
)auto_increment=1;
 