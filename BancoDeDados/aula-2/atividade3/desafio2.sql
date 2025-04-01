
CREATE DATABASE IF NOT EXISTS dbpesquisa;

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

select * from ruidos;

select avg(nivel) as nivel_medio from ruidos;

select count(nivel) as quantidade from ruidos;

select sum(nivel) as soma_ruido from ruidos;

select max(nivel) as max_ruido from ruidos;

select min(nivel) as min_ruido from ruidos;



INSERT INTO ruidos (nivel, horario) VALUES
(85, '12:24'),
(92, '12:45'),
(95, '13:00'),
(98, '13:30'),
(101, '14:00'),
(103, '14:15'),
(107, '14:30'),
(110, '15:00'),
(114, '15:15'),
(117, '15:30'),
(120, '16:00'),
(120, '16:15'),
(122, '16:30'),
(125, '17:00'),
(127, '17:15'),
(112, '17:30');



