-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-04-2024 a las 23:35:36
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
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `idpersona` int(11) NOT NULL,
  `nombre` text DEFAULT NULL,
  `apellido` text DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `dni` int(11) NOT NULL,
  `idciudad` int(11) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`idpersona`, `nombre`, `apellido`, `fecha_nac`, `dni`, `idciudad`, `sexo`) VALUES
(1, 'Juan', 'Perez', '1989-08-07', 30768546, 1, 'M'),
(2, 'Ximena', 'Lopez', '1990-05-06', 34876198, 2, 'F'),
(3, 'Valeria', 'Garcia', '1991-02-03', 34456987, 4, 'F'),
(4, 'Carolina', 'Gomez', '1970-02-11', 22897516, 1, 'F'),
(5, 'Jose', 'Perez', '1983-10-10', 19827654, 4, 'M'),
(6, 'Fernando', 'Juarez', '1976-06-11', 25893742, 1, 'M'),
(7, 'Emanuel', 'Garcia', '1992-12-08', 32786534, 2, 'M'),
(8, 'Sandra', 'Rodriguez', '1976-03-09', 25715222, 1, 'F'),
(9, 'Daniel', 'Dileo', '1960-02-11', 18765789, 4, 'M'),
(10, 'Ariel', 'Campos', '1970-02-12', 23725639, 2, 'M');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`idpersona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
