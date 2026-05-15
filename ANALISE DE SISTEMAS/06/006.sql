DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS restaurante;
DROP TABLE IF EXISTS pedidos;
DROP TABLE IF EXISTS entregadores;
DROP TABLE IF EXISTS formas_pagamento;

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

CREATE TABLE entregadores(
	id_entregador INTEGER PRIMARY KEY AUTOINCREMENT,
  	nome_entregador VARCHAR(100) NOT NULL,
  	telefone INT,
  	veiculo VARCHAR(20)
);

CREATE TABLE formas_pagamento(
	id_pagamento INTEGER PRIMARY KEY AUTOINCREMENT,
  	tipo_pagamento VARCHAR(20) NOT NULL
);

CREATE TABLE pedidos(
	id_pedido INTEGER PRIMARY KEY AUTOINCREMENT,
  	id_cliente INTEGER,
  	id_restaurante INTEGER,
  	id_entregador INTEGER,
 	valor_total REAL,
  	data_pedido DATE,
  	id_pagamento INTEGER,
  	tipo_pagamento VARCHAR(20),
  	FOREIGN KEY (id_cliente) REFERENCES clientes(id_ckiente),
  	FOREIGN KEY (id_restaurante) REFERENCES restaurantes(id_restaurante),
  	FOREIGN KEY (id_entregador) REFERENCES entregadores(id_entregador),
  	FOREIGN KEY (id_pagamento) REFERENCES formas_pagamento(id_pagamento),
  	FOREIGN key (tipo_pagamento) REFERENCES formas_pagamento(tipo_pagamento)
);

INSERT INTO clientes(nome, telefone) VALUES
('João Silva', '11999999999'),
('Maria Souza', '21999999999'),
('Carlos Lima', '32197777777');

INSERT INTO restaurante(nome, categoria) VALUES
('Burger House', 'Hambúrguer'),
('Pizza Express', 'Pizza'),
('Comida Caseira da Ana', 'Caseira');

INSERT INTO entregadores(nome_entregador, telefone, veiculo) VALUES
('Davi Inácio', 31982828282, 'Moto'),
('André Figueiredo', 3199181232, 'Carro'),
('Gabriel Magalhães', 2187232232, 'Moto');

INSERT INTO formas_pagamento(tipo_pagamento) VALUES
('Pix'),
('Crédito'),
('Debito');

INSERT INTO pedidos(id_cliente, id_restaurante, id_entregador, valor_total, data_pedido, id_pagamento, tipo_pagamento) VALUES
(1, 1, 1, 35.00, '2026-05-10', 1, 'Pix'),
(2, 2, 2, 58.50, '2026-05-10', 2, 'Crédito'),
(3, 3, 3, 25.00, '2026-05-11', 3, 'Debito');


SELECT * from clientes;
SELECT * FROM restaurante;
SELECT * FROM entregadores;
SELECT * FROM pedidos;

UPDATE clientes
SET telefone = '3100004124'
WHERE id_cliente = 1;

--novo--
UPDATE restaurante
SET nome = 'Rancho do Leo'
WHERE id_restaurante = 3;

SELECT * FROM clientes;
SELECT * FROM restaurante;