create table candidato(
	id int not null auto_increment primary key,
	nome varchar(100),
	email varchar(50),
	dataNasc date,
	senha varchar(100),
	telefone int
)