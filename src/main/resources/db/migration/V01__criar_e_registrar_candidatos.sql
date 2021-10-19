create table candidato(
	id int not null auto_increment primary key,
	nome varchar(100),
	email varchar(50),
	dataNasc date,
	telefone bigint(11),
	senha varchar(100)
)engine=InnoDB;

insert into candidato(nome, email, dataNasc, telefone, senha)
	values(
		'Samuel José',
		'samuel@email.com.br',
		'2002-01-28',
		61999999999,
		'eu@123'
	);
	
insert into candidato(nome, email, dataNasc, telefone, senha)
	values(
		'José Victor',
		'jose@email.com.br',
		'2003-09-17',
		61988888888,
		'eu@123'
	);
	
insert into candidato(nome, email, dataNasc, telefone, senha)
	values(
		'Samuel José',
		'mariinha@email.com.br',
		'2012-03-30',
		61977777777,
		'eu@123'
	);