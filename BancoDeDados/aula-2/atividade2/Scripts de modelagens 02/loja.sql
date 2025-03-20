create database if not exists db_loja
charset utf8mb4 collate utf8mb4_general_ci;
use db_loja;

create table if not exists tb_cliente(
	id int primary key auto_increment,
    nome varchar(255) not null,
    email varchar(255) not null
)auto_increment=1;

create table if not exists tb_produtos(
	id int primary key auto_increment,
    nome varchar(255) not null,
    preco float(5,2)
)auto_increment=1;

create table if not exists tb_pedidos(
	id int primary key auto_increment,
    dt_pedido date,
    id_produto int,
constraint fk_produto_id foreign key (id_produto) references tb_produtos(id)
)auto_increment=1;

create table if not exists tb_pedidos_produtos(
	id_produto int,
    id_cliente int,
constraint fk_produtos_id foreign key (id_produto) references tb_produtos(id),
constraint fk_cliente_id foreign key (id_cliente) references tb_cliente(id)
)auto_increment=1; 
