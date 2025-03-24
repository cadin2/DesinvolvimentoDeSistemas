create database if not exists db_empresa
charset utf8mb4 collate utf8mb4_general_ci;

use db_empresa;

create table if not exists tb_funcionario(
	id int primary key auto_increment,
    nome varchar(100) not null,
    cargo varchar(50) not null,
    salario decimal(10,2) not null,
    dt_admissao date
)auto_increment=1;

insert into tb_funcionario (nome, cargo, salario, dt_admissao) value ('ramon fino', 'zelador bombado','1753,00','2000-06-29'); 
insert into tb_funcionario (nome, cargo, salario, dt_admissao) value ('marcos', 'estagiario de portaria','1585,00','2009-08-13'); 
insert into tb_funcionario (nome, cargo, salario, dt_admissao) value ('ana yancard', 'analista de esquema de pirâmide','1923,0','2004-10-18'); 
insert into tb_funcionario (nome, cargo, salario, dt_admissao) value ('pedro marino', 'gerente','3923,0','2000-12-10'); 
insert into tb_funcionario (nome, cargo, salario, dt_admissao) value ('neymar', 'meio-campo','5923,0','2000-12-10'); 

alter table tb_funcionario modify column nome tinytext;

delete from tb_funcionario where id = 4;

truncate table tb_funcionario;

select * from tb_funcionario order by nome asc;

select * from tb_funcionario where cargo = 'gerente'; 

select * from tb_funcionario where salario > 5000; 

select nome, cargo  from tb_funcionario; 

delete from tb_funcionario where salario = '1923,0';

UPDATE tb_funcionario SET salario = NULL WHERE id = 2;

alter table tb_funcionario add departamento varchar(100);

update tb_funcionario set salario = LEAST(salario, 15000);

select*from tb_funcionario;

alter table tb_funcionario drop column id;
drop table tb_funcionario;
drop database db_empresa;