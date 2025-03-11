![banner de banco de dados](./imagens/banner.jpg)



# Banco de Dados 📂

Este repositório contém o banco de dados desenvolvido para o sistema **Gestão de Vendas**, projetado para armazenar e gerenciar as informações relacionadas a produtos, clientes e transações. Ele foi construído com o objetivo de oferecer desempenho eficiente, segurança de dados e escalabilidade.

## 📋 Visão Geral
O banco de dados utiliza **PostgreSQL**, um sistema de gerenciamento de banco de dados relacional robusto e confiável. Ele foi estruturado para atender a operações como:
- Registro de clientes, produtos e vendas.
- Consultas rápidas para extração de relatórios financeiros.
- Atualizações e exclusões de dados de forma segura e controlada.

A arquitetura segue os princípios de normalização para reduzir redundâncias e manter a integridade dos dados.

## 🎯 Objetivos Principais
1. Garantir a organização e integridade das informações.
2. Facilitar a execução de consultas e operações de maneira eficiente.
3. Suportar a escalabilidade do sistema de vendas.

---

## 📂 Estrutura do Banco de Dados
- **Tabelas Principais**:
  - **Clientes**: Armazena as informações de cadastro dos clientes, como nome, email e telefone.
  - **Produtos**: Contém os dados dos produtos cadastrados, incluindo nome, preço e estoque.
  - **Vendas**: Registra todas as transações, incluindo o cliente, os produtos vendidos e a data da venda.

- **Relacionamentos**:
  - A tabela `Vendas` possui chaves estrangeiras que se relacionam às tabelas `Clientes` e `Produtos`.

---

## Tecnologias
![icon de banco de dados](./imagens/icons/icons8-python-64.png)
![icon de banco de dados](./imagens/icons/icons8-git-48.png)
![icon de banco de dados](./imagens/icons/icons8-maria-db-48.png)
![icon de banco de dados](./imagens/icons/icons8-banco-de-dados.gif)


## modelagens 

- [petshop](./Modelagens/petshop/petshop.md)
- [biblioteca e associados](./Modelagens/biblioteca%20e%20associados/bibliotecaAsso.md)
- [berçario](./Modelagens/berçario/berçario.md)
- [floricultura](./Modelagens/floricultura/floricultura.md)
- [biblioteca de livros e autores](./Modelagens/biblioteca%20de%20livros%20e%20autores/biblioteca%20de%20livros%20e%20autores.md)
- [pedidos de produtos](./Modelagens/pedidos%20de%20produtos/pedidos.md)

