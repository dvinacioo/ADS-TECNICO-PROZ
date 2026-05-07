DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes(
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nome TEXT,
  idade INTEGER,
  cidade TEXT,
  plano INTEGER
  );
  
 INSERT INTO clientes(nome, idade, cidade, plano)
 VALUES
 ('Marcos Silva', 28, 'Belo Horizonte', 'Basico'),
 ('Juliana Costa', 35, 'Contagem', 'Premium'),
 ('Fernanda SOuza', 22, 'Betim', 'Basico'),
 ('Ricardo Mendes', 41, 'Nova Lima', 'Premium'),
 ('Camila Rocha', 30, 'Riberão das Neves', 'INtermediario'),
 ('Paulo Henrique', 26, 'Belo Horizoonte', 'Premium'),
 ('Amanda Lima', 38, 'Contagem', 'Basico'),
 ('Lucas Martins', 45, 'Sabara', 'Premium'),
 ('Patricia Alves', 29, 'Betim', 'Intermediario'),
 ('Bruno Ferreira', 33, 'Nova Lima', 'Basico');
 

   SELECT * FROM clientes;