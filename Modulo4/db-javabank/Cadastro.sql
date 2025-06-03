create database Cadastro;
use Cadastro;
DROP database Cadastro;
create table usuarios(
	id int auto_increment primary key,
    nome varchar (100),
    email varchar(100),
    telefone varchar(20),
    tipo_usuario varchar(50)
    )auto_increment=1;
    
    select * from usuarios;
    