CREATE DATABASE IF NOT EXISTS db_restaurante COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_restaurante;

CREATE TABLE IF NOT EXISTS tb_cliente (
	id_cliente  INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL
)AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS tb_prato (
	id_prato INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(255) NOT NULL
)AUTO_INCREMENT = 1;

-- TABELAS COM ESTRANGEIRAS

CREATE TABLE IF NOT EXISTS tb_pedido (
	id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    valor FLOAT(5,2) NOT NULL,
    id_cliente INT,
    
    CONSTRAINT fk_cliente_id_cliente FOREIGN KEY (id_cliente) REFERENCES tb_cliente(id_clinte) ON DELETE CASCADE
)AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS tb_pedido_prato (
	id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    id_prato INT,
    id_pedido INT,
    
    CONSTRAINT fk_prato_id_prato FOREIGN KEY (id_prato) REFERENCES tb_prato(id_prato) ON DELETE CASCADE,
    CONSTRAINT fk_pedido_id_pedido FOREIGN KEY (id_pedido) REFERENCES tb_pedido(id_pedido) ON DELETE CASCADE
);