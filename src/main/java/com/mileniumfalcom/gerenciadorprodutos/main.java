/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mileniumfalcom.gerenciadorprodutos;

/**
 *
 * @author Victor
 */
public class main {
    public static void main(String[] args) {
            System.out.println("teste");
            
        /*
            1 - incluir novo registro de produto com data do sistema e categoria
            2 - alterar registro de produto
            3 - excluir registro de produto 
            4 - listar produtos
            5- buscar categoria se existente.
            6 - interface de cadastro de produto que inclui categoria utilizando swing
            7 - inserir produto no banco
            8 - listar produto no banco
            9 - alterar produto no banco
            10 - listar categorias no banco
            11 - classe com  metodos de comunicação de listagem de dados do banco com a interface
            
            
            script a baixo
            
            CREATE DATABASE PRODUTOBD;

CREATE TABLE PRODUTOBD.PRODUTO (
  ID           BIGINT        NOT NULL AUTO_INCREMENT,
  NOME         VARCHAR(100)  NOT NULL,
  DESCRICAO    VARCHAR(1000) NULL,
  PRECO_COMPRA DECIMAL(9,2)  NOT NULL,
  PRECO_VENDA  DECIMAL(9,2)  NOT NULL,
  QUANTIDADE   INT           NOT NULL DEFAULT 0,
  DISPONIVEL   BOOL          NOT NULL DEFAULT TRUE,       
  DT_CADASTRO  TIMESTAMP     NOT NULL,
  CONSTRAINT PK_PRODUTO PRIMARY KEY (ID)
);

CREATE TABLE PRODUTOBD.CATEGORIA (
  ID   INT          NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(100) NOT NULL,
  CONSTRAINT PK_CATEGORIA PRIMARY KEY (ID),
  CONSTRAINT UC_NOME UNIQUE (NOME)
);

CREATE TABLE PRODUTOBD.PRODUTO_CATEGORIA (
    ID_PRODUTO   BIGINT NOT NULL,
    ID_CATEGORIA INT    NOT NULL,
    CONSTRAINT FK_PRODUTO FOREIGN KEY (ID_PRODUTO) REFERENCES PRODUTOBD.PRODUTO(ID),
    CONSTRAINT FK_CATEGORIA FOREIGN KEY (ID_CATEGORIA) REFERENCES PRODUTOBD.CATEGORIA(ID)
);

INSERT INTO PRODUTOBD.CATEGORIA(NOME) VALUES ("Categoria Um");
INSERT INTO PRODUTOBD.CATEGORIA(NOME) VALUES ("Categoria Dois");
INSERT INTO PRODUTOBD.CATEGORIA(NOME) VALUES ("Categoria Três");
INSERT INTO PRODUTOBD.CATEGORIA(NOME) VALUES ("Categoria Quatro");
INSERT INTO PRODUTOBD.CATEGORIA(NOME) VALUES ("Categoria Cinco");
           
            
            
            */
    }
}
