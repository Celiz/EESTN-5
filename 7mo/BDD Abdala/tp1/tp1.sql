-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-05-2024 a las 00:54:08
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
-- Base de datos: `restaurante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_comidas`
--

CREATE TABLE `lista_comidas` (
  `Numero` int(11) NOT NULL,
  `Plato` varchar(25) NOT NULL,
  `Precio_porcion` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lista_comidas`
--

INSERT INTO `lista_comidas` (`Numero`, `Plato`, `Precio_porcion`) VALUES
(1, 'Milanesa napolitana', 1500),
(2, 'Asado de tira', 2200),
(3, 'Pizza muzzarella', 1300),
(4, 'Ensalada César', 1000),
(5, 'Hamburguesa completa', 1800),
(6, 'Locro', 1600),
(7, 'Sushi', 2500),
(8, 'Trucha a la parrilla', 2000),
(9, 'Fideos con tuco', 1100),
(10, 'Pollo al horno', 1400),
(11, 'Bife de chorizo', 2100),
(12, 'Helado de crema', 800),
(13, 'Milanesa napolitana', 1500),
(14, 'Asado de tira', 2200),
(15, 'Pizza muzzarella', 1300),
(16, 'Ensalada César', 1000),
(17, 'Hamburguesa completa', 1800),
(18, 'Locro', 1600),
(19, 'Sushi', 25000),
(20, 'Trucha a la parrilla', 20000),
(21, 'Fideos con tuco', 1100),
(22, 'Pollo al horno', 1400),
(23, 'Bife de chorizo', 21000),
(24, 'Helado de crema', 800);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `lista_comidas`
--
ALTER TABLE `lista_comidas`
  ADD PRIMARY KEY (`Numero`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `lista_comidas`
--
ALTER TABLE `lista_comidas`
  MODIFY `Numero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;