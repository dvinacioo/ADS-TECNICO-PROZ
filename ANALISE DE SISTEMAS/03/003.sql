DROP TABLE if EXISTS Emprestimo;
DROP TABLE if EXISTS Livro;
DROP TABLE if EXISTS Usuario;

CREATE TABLE Usuario (
	id_usuario INT PRIMARY KEY,
  	nome VARCHAR(100) NOT NULL
);

CREATE TABLE Livro (
	id_livro INT PRIMARY KEY,
  	titulo VARCHAR(150) NOT NULL,
  	autor VARCHAR(100),
  	ano INT
);

CREATE TABLE Emprestimo (
	id_emprestimo INT PRIMARY KEY,
  	id_usuario INT,
  	id_livro INT,
  	data_emprestimo DATE,
  	data_devolucao DATE,
  	FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario),
  	FOREIGN KEY (id_livro) REFERENCES Livro(id_livro)
);

INSERT INTO Usuario VALUES
(1, 'Maria Silva');

INSERT INTO Livro VALUES
(1, 'Banco de Dados 1', 'Carlos Souza', 2020),
(2, 'Algoritimos', 'Ana Lima', 2019),
(3, 'Inteligência Artificial', 'Pedro Santos', 2024);

INSERT INTO Emprestimo VALUES
(1, 1, 1, '2026-05-01', '20206-05-10'),
(2, 1, 2, '2026-05-02', '20206-05-12'),
(3, 1, 3, '2026-05-03', '20206-05-13');

SELECT * from  Usuario;
SELECT * FROM Livro;
SELECT * FROM Emprestimo;
