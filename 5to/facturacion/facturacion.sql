/*
SQLyog - Free MySQL GUI v5.02
Host - 5.5.5-10.4.6-MariaDB : Database - facturacion
*********************************************************************
Server version : 5.5.5-10.4.6-MariaDB
*/


create database if not exists `facturacion`;

USE `facturacion`;

/*Table structure for table `categorias` */

DROP TABLE IF EXISTS `categorias`;

CREATE TABLE `categorias` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `categorias` */

insert into `categorias` values 

(1,'Microprocesadores'),

(2,'Discos Solidos SSD'),

(3,'Placas De Video');

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `mail` varchar(70) DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `clientes` */

insert into `clientes` values 

(1,'Diego Moisset','23567892','diegomoisset@gmail.com','Colon 345'),

(2,'Ana Paula','643456644','anapaula@gmail.com','Dean Funes 345'),

(3,'Marcos Rodriguez','65984384','marcosrodriguez@gmail.com','23 de septiembre 3444');

/*Table structure for table `detallefactura` */

DROP TABLE IF EXISTS `detallefactura`;

CREATE TABLE `detallefactura` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `codigofactura` int(11) DEFAULT NULL,
  `codigoproducto` int(11) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;

/*Data for the table `detallefactura` */

insert into `detallefactura` values 

(1,1,3,17800,1),

(2,1,6,2199,1),

(3,1,8,30000,1),

(4,2,7,20995,1),

(5,3,1,3499,1),

(6,3,2,6245,1),

(7,3,3,17800,1),

(8,3,4,23999,1),

(9,3,5,1595,1),

(10,3,6,2199,1),

(11,3,7,20995,1),

(12,3,8,30000,3),

(15,5,1,3499,1),

(16,8,1,3499,1),

(33,13,8,30000,1),

(34,13,6,2199,1),

(35,13,4,23999,1);

/*Table structure for table `facturas` */

DROP TABLE IF EXISTS `facturas`;

CREATE TABLE `facturas` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `codigocliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `facturas` */

insert into `facturas` values 

(1,'2019-08-28',1),

(2,'2019-08-28',2),

(3,'2019-08-28',3),

(5,NULL,NULL),

(6,NULL,NULL),

(7,NULL,NULL),

(8,NULL,NULL),

(10,NULL,NULL),

(11,'2019-08-28',1),

(12,NULL,NULL),

(13,'2019-08-29',1);

/*Table structure for table `productos` */

DROP TABLE IF EXISTS `productos`;

CREATE TABLE `productos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `codigocategoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `productos` */

insert into `productos` values 

(1,'Intel celeron g4900 2/2 3.1ghz',3499,1),

(2,'Intel core i3 9100f coffeelake',6245,1),

(3,'Intel core i5 9600k',17800,1),

(4,'Intel core i7 8700 coffee lake',23999,1),

(5,'ssd 120gb wd green',1595,2),

(6,'ssd 240gb wd green sata iii 2.5',2199,2),

(7,'nvidia geforce gtx 1660ti',20995,3),

(8,'nvidia geforce rtx 2060 6gb',30000,3);
