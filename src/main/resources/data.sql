
DROP table IF EXISTS articulos;
DROP table IF EXISTS fabricantes;

create table fabricantes(
    id int auto_increment,
    nombre varchar(250),
	PRIMARY KEY (id)
);

create table articulos(
    id int auto_increment,
    nombre varchar(250),
    precio int,
    fabricante int,
	PRIMARY KEY (id),
	CONSTRAINT fabricantes_fk FOREIGN KEY (fabricante) REFERENCES fabricantes (id)
);

insert into fabricantes (nombre)values('AMD');
insert into fabricantes (nombre)values('Intel');
insert into articulos (nombre,precio,fabricante)values('Ryzen 5 5600X',220,1);
insert into articulos (nombre,precio,fabricante)values('Core i5-12600k',340,2);
insert into articulos (nombre,precio,fabricante)values('Ryzen 7 5800X',320,1);
insert into articulos (nombre,precio,fabricante)values('Core i7-12700k',440,2);