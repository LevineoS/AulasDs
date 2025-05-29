CREATE DATABASE projetojava;

USE projetojava;


CREATE TABLE usuario (

id BIGINT(10) AUTO_INCREMENT,
nome VARCHAR(255),
cpf VARCHAR(255),
email VARCHAR(255),
telefone VARCHAR(255),
PRIMARY KEY (id)

);

SELECT * FROM usuario;

ALTER TABLE usuario ADD idade INT;
ALTER TABLE usuario ADD CorCabelo VARCHAR(255);

ALTER TABLE usuario MODIFY idade VARCHAR(255);

SELECT * FROM usuario;
