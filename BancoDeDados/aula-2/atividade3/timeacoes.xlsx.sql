CREATE DATABASE IF NOT EXISTS db_situacaoProblema1 CHARSET utf8mb4 COLLATE utf8mb4_general_ci;

USE db_situacaoProblema1;

CREATE TABLE IF NOT EXISTS acoes(
   id int primary key auto_increment,
   valor decimal(2,2) NOT NULL
   
)AUTO_INCREMENT=1;

show tables;
describe acoes;

-- Alterar tabela
ALTER TABLE acoes MODIFY COLUMN valor DECIMAL(10,2);

-- DML
INSERT INTO acoes(valor) 
VALUES ('1.31'),

('1.34'),
 ('1.42'),
 ('1.4'),
('1.47'),
('1.45'),
('1.48'),
('1.42'),
('1.34'),
('1.35'),
('1.35'),
('1.36'),
('1.32'),                                   
('1.24'),
('1.22'),
('1.27'),
('1.26');
select * from acoes;
describe acoes;

create view estatisticas_acoes as 
select(select max(valor) from acoes) as max_valor,
(select min(valor) from acoes) as min_valor,
(select sum(valor)from acoes) as sum_valor,
(select avg(valor) from acoes) as avg_valor;

select * from estatisticas_acoes;

