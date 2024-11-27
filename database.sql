-- Criação do banco de dados
CREATE DATABASE sistema_pedidos;

-- Seleção do banco
USE sistema_pedidos;

-- Tabela de usuários
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    matricula INT NOT NULL,
    nome VARCHAR(100),
    senha VARCHAR(100),
    tipo ENUM('administrador', 'aluno') NOT NULL
);

-- Tabela de produtos
CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    tipo ENUM('lanche', 'bebida'),
    valor DECIMAL(10, 2),
    detalhes VARCHAR(255)
);

-- Tabela de pedidos
CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT,
    valor_total DECIMAL(10, 2),
    meio_pagamento VARCHAR(50),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);