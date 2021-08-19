DROP TABLE IF EXISTS ARTICULOS;
DROP TABLE IF EXISTS FABRICANTES;

CREATE TABLE FABRICANTES (
Codigo INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100));

CREATE TABLE ARTICULOS (
Codigo INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
precio INT(20),
CodigoFabricante INT(20),
FOREIGN KEY (CodigoFabricante) REFERENCES FABRICANTES (Codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into FABRICANTES (nombre) values ('hola');
insert into FABRICANTES (nombre) values ('que');
insert into FABRICANTES (nombre) values ('tal');
insert into FABRICANTES (nombre) values ('jose');

insert into ARTICULOS (nombre, precio, CodigoFabricante)values('Tu',10,2);
insert into ARTICULOS (nombre, precio, CodigoFabricante)values('Yo',8,1);
insert into ARTICULOS (nombre, precio, CodigoFabricante)values('Nosotros',38,1);
insert into ARTICULOS (nombre, precio, CodigoFabricante)values('Vosotros',44,1);