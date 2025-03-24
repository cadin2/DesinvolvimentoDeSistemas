create database if not exists cliente_barbearia;
use cliente_barbearia;

create table if not exists funcionarios(
	id int primary key auto_increment,
    nome varchar(255) not null,
    funcao varchar(255) not null,
    cpf char(11) not null,
    telefone varchar(255)
)auto_increment=1;

insert into funcionarios (nome,funcao,cpf,telefone)
values('pedrin','faxineiro','32168459778','26845791'),
('laura','atendente','45684226859','45863254'),
('nathan','barbeiro','15648642635','26845319'),
('guilerme','barbeiro','15742638856','487523665'),
('thalita','cabeleleira','176535926854','14753692');

select * from funcionarios;
