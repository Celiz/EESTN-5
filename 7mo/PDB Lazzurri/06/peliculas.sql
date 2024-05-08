-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-04-2024 a las 01:17:58
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `curso`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `idpeliculas` int(11) NOT NULL,
  `titulo` varchar(80) DEFAULT NULL,
  `genero` varchar(20) DEFAULT NULL,
  `director` varchar(80) DEFAULT NULL,
  `duracion` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`idpeliculas`, `titulo`, `genero`, `director`, `duracion`) VALUES
(1, 'Jurassic Park', 'Ciencia Ficción', 'Steven Spielberg', 127),
(2, 'E.T. El Extraterrestre', 'Ciencia Ficción', 'Steven Spielberg', 115),
(3, 'La Lista de Schindler', 'Drama histórico', 'Steven Spielberg', 156),
(4, 'El Padrino', 'Drama', 'Francis Ford Coppola', 175),
(5, 'Casablanca', 'Romance', 'Michael Curtiz', 104),
(6, 'El Caballero Oscuro', 'Thriller', 'Christopher Nolan', 165),
(7, 'Pulp Fiction', 'Crimen', 'Quentin Tarantino', 154),
(8, '12 Angry Men', 'Drama', 'Sidney Lumet', 96),
(9, 'El Señor de los Anillos: La Comunidad del Anillo', 'Fantasía', 'Peter Jackson', 178),
(10, 'La La Land', 'Romance', 'Damien Chazelle', 88);


--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`idpeliculas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `idpeliculas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
