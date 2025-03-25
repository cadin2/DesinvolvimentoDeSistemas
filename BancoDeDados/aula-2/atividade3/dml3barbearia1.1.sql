create database if not exists Barbearia;
use Barbearia;

create table if not exists servicos(
	id int primary key auto_increment,
    nome_cliente varchar(255) not null,
    nome_servicos varchar(255) not null,
    valor float(5,2)
)auto_increment=1;

insert into servicos (nome_cliente, nome_servicos,valor) 
values('jose','corte/maquina + barba','50'),
('carlos','corte/maquina + sobrancelha','45'),
('robesvaldo','tesoura + barba','30');

select * from servicos where id = 3;

select * from servicos where valor > 30;

select nome_cliente from servicos where id;

select * FROM servicos;