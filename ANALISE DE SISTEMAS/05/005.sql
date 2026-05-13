DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS restaurante;
DROP TABLE IF EXISTS pedidos;

CREATE TABLE clientes(
	id_cliente INTEGER PRIMARY KEY AUTOINCREMENT,
  	nome VARCHAR(100) NOT NULL,
  	telefone INT NOT NULL
);

CREATE TABLE restaurante(
	id_restaurante INTEGER PRIMARY KEY AUTOINCREMENT,
  	nome VARCHAR(100) NOT NULL,
  	categoria VARCHAR(80)
);

CREATE TABLE pedidos(
	id_pedido INTEGER PRIMARY KEY AUTOINCREMENT,
  	id_cliente INTEGER,
  	id_restaurante INTEGER,
 	valor_total REAL,
  	data_pedido DATE,
  	FOREIGN KEY (id_cliente) REFERENCES clientes(id_ckiente),
  	FOREIGN KEY (id_restaurante) REFERENCES restaurantes(id_restaurante)
);

INSERT INTO clientes(nome, telefone) VALUES
('João Silva', '11999999999'),
('Maria Souza', '21999999999'),
('Carlos Lima', '32197777777');

INSERT INTO restaurante(nome, categoria) VALUES
('Burger House', 'Hambúrguer'),
('Pizza Express', 'Pizza'),
('Comida Caseira da Ana', 'Caseira');

INSERT INTO pedidos(id_cliente, id_restaurante, valor_total, data_pedido) VALUES
(1, 1, 35.00, '2026-05-10'),
(2, 2, 58.50, '2026-05-10'),
(3, 3, 25.00, '2026-05-11');


SELECT * from clientes;
SELECT * FROM restaurante;
SELECT * from pedidos;