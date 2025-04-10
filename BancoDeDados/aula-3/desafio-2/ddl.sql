CREATE DATABASE IF NOT EXISTS dbpesquisa
charset utf8mb4 collate utf8mb4_general_ci; 
USE dbpesquisa;


DROP DATABASE dbpesquisa;


CREATE TABLE IF NOT EXISTS ruidos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nivel INT,
    horario TIME
)AUTO_INCREMENT = 1;


CREATE TABLE IF NOT EXISTS cruzamento (
    id INT PRIMARY KEY AUTO_INCREMENT,
    endereco VARCHAR(255),
    nome VARCHAR(255)
)AUTO_INCREMENT = 1;


CREATE TABLE IF NOT EXISTS nivel_medio (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nivel_id INT,
    horario_id TIME,
   CONSTRAINT fk_nivel_id FOREIGN KEY (nivel_id) REFERENCES ruidos(id)
)AUTO_INCREMENT = 1;

create table if not exists relatorio(
	id int primary key auto_increment,
    descricao_lab varchar (60) not null,
    contexto text not null,
    fonte_dados text not null,
    metodo_amostragem text,
    eda text
)auto_increment=1;
