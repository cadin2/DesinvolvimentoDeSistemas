



-- comentário

-- Criar um banco de dados

-- Linguagem SQL

-- DDL , DML, DQL

-- DDL (Data Definition Language)
-- CREATE , DROP , ALTER
-- criar o banco de dados
drop database if exists salaoestilorei; -- ddl
CREATE DATABASE if not exists salaoestilorei; -- ddl
-- usar o banco de dados
USE salaoestilorei;
-- criar a tabela
CREATE TABLE if not exists cliente(
    id int primary key auto_increment,
    nome varchar(80) NOT NULL,
    telefone char(13),
    email varchar(80) UNIQUE NOT NULL,
    senha varchar(255) NOT NULL
);

INSERT INTO cliente (nome, telefone, email, senha) VALUES
('Ana Silva', '61999991111', 'ana.silva@email.com', 'senha123'),
('Bruno Oliveira', '61988882222', 'bruno.oliveira@email.com', 'senha456'),
('Carla Rodrigues', '61977773333', 'carla.rodrigues@email.com', 'senha789'),
('Daniel Souza', '61966664444', 'daniel.souza@email.com', 'senhaabc'),
('Elisa Costa', '61955555555', 'elisa.costa@email.com', 'senhaxyz'),
('Fernando Pereira', '61944446666', 'fernando.pereira@email.com', 'senha1a2b'),
('Gabriela Santos', '61933337777', 'gabriela.santos@email.com', 'senha3c4d'),
('Henrique Lima', '61922228888', 'henrique.lima@email.com', 'senha5e6f'),
('Isabela Gomes', '61911119999', 'isabela.gomes@email.com', 'senha7g8h'),
('João Ribeiro', '61900001234', 'joao.ribeiro@email.com', 'senha9i0j');

update cliente set email = 'ana.c.santos23@aluno.senai.br' where id = 2; 

update cliente set email = 'gabriela.o.santos@aluno.senai.br' where id = 8 ;

select nome,email from cliente where email like '%@aluno.senai.br';  



select * from cliente; 
-- DML
INSERT INTO cliente(nome,
					telefone,
                    email,
                    senha)values
                    ('Rodrigo',
					 '61987789878',
					 'rodrigo@aluno.senai.br',
					 '123'); -- DML
-- DQL
SELECT * FROM cliente;

-- Exercício : 1 ponto
-- Inserir todos os alunos presentes
--  e não presentes na tabela cliente
ALTER TABLE cliente MODIFY senha VARCHAR(64) NOT NULL;

-- mostrar a estrutura da tabela
describe cliente;
-- Exercício
-- "Marvin agora é só você..."
-- Criar a tabela Funcionario
-- Criar o servico
-- criar a tabela funcionário
CREATE TABLE if not exists funcionario(
    id int primary key auto_increment,
    nome varchar(80) NOT NULL  
);

insert into funcionario (nome)
values('henrique'),
('felepe'),
('pelé'),
('yan'),
('nathanas'),
('jhon'),
('joão'),
('nielson'),
('thalita'),
('paulo');

-- DROP TABLE servico;
CREATE TABLE if not exists servico(
    id int primary key auto_increment,
    nome varchar(80) NOT NULL,
    valor decimal(8,2)   
);
-- Mostrar dados do serviço
SELECT * FROM servico;
-- Criar a tabela de agendamento
CREATE TABLE if not exists agendamento(
   id int primary key auto_increment,
   data_agenda date NOT NULL,
   hora time NOT NULL,
   fk_cliente_id int NOT NULL,  -- campo do tipo inteiro
   fk_servico_id int NOT NULL,  -- campo do tipo inteiro
   fk_funcionario_id int NOT NULL -- campo do tipo inteiro
);

-- alterar a tabela agendamento = alter table
-- adicionamos constraint com o nome FK
ALTER TABLE agendamento ADD CONSTRAINT FK_agendamento_cli
      foreign key(fk_cliente_id)
      references cliente(id)
      ON DELETE CASCADE;
      
ALTER TABLE agendamento ADD CONSTRAINT FK_agendamento_fun
      foreign key(fk_funcionario_id)
      references funcionario(id)
      ON DELETE CASCADE;
      
ALTER TABLE agendamento ADD CONSTRAINT FK_agendamento_ser
      foreign key(
      fk_servico_id)
      references servico(id)
      ON DELETE CASCADE;
      

      
select * from servico;