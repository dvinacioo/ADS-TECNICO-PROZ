DROP TABLE IF EXISTS Alunos;
DROP TABLE IF EXISTS Matriculas;
DROP TABLE IF EXISTS Cursos;

CREATE TABLE Alunos(
	id_aluno INTEGER PRIMARY KEY AUTOINCREMENT,
  	nome_aluno VARCHAR(100) NOT NULL,
  	data_nascimento DATE NOT NULL,
  	emails VARCHAR(100) NOT NULL
);

CREATE TABLE Cursos(
	id_curso INTEGER PRIMARY KEY AUTOINCREMENT,
  	nome_curso VARCHAR(80) NOT NULL,
  	dia_semana INT NOT NULL
);

CREATE TABLE Matriculas(
	id_matricula INTEGER PRIMARY KEY AUTOINCREMENT,
  	data_matricula DATE NOT NULL,
  	id_aluno INTEGER,
  	nome_aluno VARCHAR(100),
  	id_curso INTEGER,
  	nome_curso VARCHAR(80),
  	status BOOLEAN NOT NULL,
  	semestre INT NOT NULL,
  	FOREIGN key(id_aluno) REFERENCES Alunos(id_aluno),
  	FOREIGN key(nome_aluno) REFERENCES Alunos(nome_aluno),
  	FOREIGN key(id_curso) REFERENCES Cursos(id_curso),
  	FOREIGN KEY(nome_curso) REFERENCES Cursos(nome_curso)
);

INSERT INTO Alunos(nome_aluno, data_nascimento, emails) VALUES
('Davi Inácio', '2007-04-21', 'dvi@gmail.com'),
('Guilherme Resende', '2007-11-20', 'guiresende22@outlook.com'),
('João Vitor', '2010-05-29', 'jvf@hotmail.com'),
('Mariana Figueiredo', '2009-07-17', 'mariaf@gmail.com'),
('Mirelly Castro', '2007-11-21', 'mii212007@gmail.com');

INSERT INTO Cursos(nome_curso, dia_semana) VALUES
('Análise e Desenvolvimento de Sistemas', 4),
('Enfermagem', 3),
('Eletrica', 3),
('Administração', 3),
('Inglês', 4);

INSERT INTO Matriculas(data_matricula, id_aluno, nome_aluno, id_curso, nome_curso, status, semestre) VALUES
('2026-05-11', 1, 'Davi Inácio', 1, 'Análise e Desenvolvimento de Sistemas', TRUE, 20261),
('2026-05-11', 2, 'Guilherme Resende', 2, 'Enfermagem', TRUE, 20261),
('2026-05-13', 3, 'João Vitor', 3, 'Eletrica', TRUE, 20262),
('2026-05-13', 4, 'Mariana Figueiredo', 5, 'Inglês', TRUE, 20262),
('2026-05-15', 5, 'Mirelly Castro', 4, 'Administração', TRUE, 20263);

SELECT * from Alunos;
SELECT * FROM Cursos;
SELECT * FROM Matriculas;