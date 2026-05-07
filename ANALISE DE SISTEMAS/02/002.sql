drop TABLE if EXISTS  Usuarios;

CREATE TABLE Usuarios (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  email TEXT NOT NULL UNIQUE,
  senha_hash TEXT NOT NULL,
  ativo BOOLEAN
);
  
  INSERT INTO Usuarios(email, senha_hash, ativo)
  VALUES
  ('dvinacio@hotmail.com', '1234senha', TRUE),
  ('isabelab.lima@gmail.com', '4321senha', FALSE),
  ('prof.barbara@yahoo.com', 'senha1234', TRUE);
  
  SELECT * FROM Usuarios;