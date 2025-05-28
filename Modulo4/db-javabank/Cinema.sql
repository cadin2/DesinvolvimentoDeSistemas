create database if not exists Cinema;

use Cinema;

CREATE TABLE IF NOT EXISTS Filme (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    genero VARCHAR(50),
    ano DATE
)  AUTO_INCREMENT=1;