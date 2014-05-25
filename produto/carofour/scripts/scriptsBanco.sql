create table clientes (
   id INT NOT NULL AUTO_INCREMENT,
   nome VARCHAR(50) NOT NULL,
   email VARCHAR(90) NOT NULL,
   senha VARCHAR(12) NOT NULL,
   dataNascimento DATE NOT NULL,
   sexo CHAR(1) NOT NULL,
   endereco VARCHAR(255) NOT NULL,
   telefone VARCHAR(12) NOT NULL,
   PRIMARY KEY ( id )
);

create table categorias (
   id INT NOT NULL,
   nome VARCHAR(50) NOT NULL,
   urlImagem VARCHAR(255) NOT NULL,
   PRIMARY KEY ( id )
);

create table produtos (
   id INT NOT NULL AUTO_INCREMENT,
   idCategoria INT NOT NULL,
   nome VARCHAR(50) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   urlImagem VARCHAR(255) NOT NULL,
   preco DECIMAL( 5,2 ) NOT NULL,
   PRIMARY KEY ( id ),
   CONSTRAINT fk_produtos_idCategoria  FOREIGN KEY ( idCategoria ) REFERENCES categorias ( id )
);

create table pedidos (
   id INT NOT NULL AUTO_INCREMENT,
   idCliente INT NOT NULL,
   numero INT NOT NULL,
   PRIMARY key ( id ),
   CONSTRAINT fk_pedido_idCliente  FOREIGN KEY ( idCliente ) REFERENCES clientes ( id )
);

create table itemPedido (
   id INT NOT NULL AUTO_INCREMENT,
   idProduto INT NOT NULL,
   idPedido INT NOT NULL,
   PRIMARY KEY ( id ),
   CONSTRAINT fk_itemPedido_idProduto  FOREIGN KEY ( idProduto ) REFERENCES produtos ( id ),
   CONSTRAINT fk_itemPedido_idPedido  FOREIGN KEY ( idPedido ) REFERENCES pedidos ( id )
);