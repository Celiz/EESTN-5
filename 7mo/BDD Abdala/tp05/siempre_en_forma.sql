-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-06-2024 a las 22:32:37
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
-- Base de datos: `siempre_en_forma`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aparato`
--

CREATE TABLE `aparato` (
  `CodigoAparato` int(11) NOT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `EstadoConservacion` varchar(50) DEFAULT NULL,
  `NumeroSala` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `aparato`
--

INSERT INTO `aparato` (`CodigoAparato`, `Descripcion`, `EstadoConservacion`, `NumeroSala`) VALUES
(1, 'Cinta de correr', 'Buen estado', 1),
(2, 'Bicicleta estática', 'Necesita mantenimiento', 1),
(3, 'Banco de pesas', 'Excelente estado', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase`
--

CREATE TABLE `clase` (
  `CodigoClase` int(11) NOT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `DiaHora` datetime DEFAULT NULL,
  `NumeroSala` int(11) DEFAULT NULL,
  `DNIMonitor` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clase`
--

INSERT INTO `clase` (`CodigoClase`, `Descripcion`, `DiaHora`, `NumeroSala`, `DNIMonitor`) VALUES
(1, 'Spinning', '2023-06-01 09:00:00', 1, '12345678A'),
(2, 'Yoga', '2023-06-02 18:30:00', 3, '87654321B'),
(3, 'Zumba', '2023-06-03 11:00:00', 3, '45678912C');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `monitor`
--

CREATE TABLE `monitor` (
  `DNI` varchar(20) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  `Titulacion` varchar(100) DEFAULT NULL,
  `ExperienciaProfesional` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `monitor`
--

INSERT INTO `monitor` (`DNI`, `Nombre`, `Telefono`, `Titulacion`, `ExperienciaProfesional`) VALUES
('12345678A', 'Juan Pérez', '123456789', 'Licenciado en Educación Física', '5 años'),
('45678912C', 'Carlos Gómez', '456789123', 'Diplomado en Fitness', '3 años'),
('87654321B', 'María López', '987654321', 'Maestría en Entrenamiento Deportivo', '8 años');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pistasquash`
--

CREATE TABLE `pistasquash` (
  `NumeroPista` int(11) NOT NULL,
  `Ubicacion` varchar(100) DEFAULT NULL,
  `Estado` varchar(50) DEFAULT NULL,
  `MetrosCuadrados` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pistasquash`
--

INSERT INTO `pistasquash` (`NumeroPista`, `Ubicacion`, `Estado`, `MetrosCuadrados`) VALUES
(4, 'Planta Baja', 'Disponible', 50.00),
(5, 'Planta Baja', 'En mantenimiento', 50.00),
(6, 'Primer Piso', 'Disponible', 60.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservapistasquash`
--

CREATE TABLE `reservapistasquash` (
  `NumeroSocio` int(11) NOT NULL,
  `NumeroPista` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reservapistasquash`
--

INSERT INTO `reservapistasquash` (`NumeroSocio`, `NumeroPista`, `Fecha`, `Hora`) VALUES
(1, 4, '2023-06-05', '10:00:00'),
(2, 4, '2023-06-05', '12:30:00'),
(3, 6, '2023-06-06', '15:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `NumeroSala` int(11) NOT NULL,
  `MetrosCuadrados` decimal(10,2) DEFAULT NULL,
  `Ubicacion` varchar(100) DEFAULT NULL,
  `TipoSala` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sala`
--

INSERT INTO `sala` (`NumeroSala`, `MetrosCuadrados`, `Ubicacion`, `TipoSala`) VALUES
(1, 100.50, 'Planta Baja', 'Cardio'),
(2, 80.00, 'Primer Piso', 'Muscular'),
(3, 120.00, 'Segundo Piso', 'General'),
(4, 55.00, 'Planta Baja', 'Pista de Squash'),
(5, 55.00, 'Planta Baja', 'Pista de Squash'),
(6, 60.00, 'Primer Piso', 'Pista de Squash');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE `socio` (
  `NumeroSocio` int(11) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Direccion` varchar(200) DEFAULT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  `Profesion` varchar(100) DEFAULT NULL,
  `DatosBancarios` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`NumeroSocio`, `Nombre`, `Direccion`, `Telefono`, `Profesion`, `DatosBancarios`) VALUES
(1, 'Ana Torres', 'Calle Principal 123', '111222333', 'Abogada', 'ES1234567890123456789012'),
(2, 'Pedro Ramírez', 'Avenida Central 456', '444555666', 'Ingeniero', 'ES9876543210987654321098'),
(3, 'Laura Sánchez', 'Plaza Mayor 789', '777888999', 'Doctora', 'ES5432109876543210987654');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socioclase`
--

CREATE TABLE `socioclase` (
  `NumeroSocio` int(11) NOT NULL,
  `CodigoClase` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `socioclase`
--

INSERT INTO `socioclase` (`NumeroSocio`, `CodigoClase`) VALUES
(1, 1),
(1, 2),
(2, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aparato`
--
ALTER TABLE `aparato`
  ADD PRIMARY KEY (`CodigoAparato`),
  ADD KEY `NumeroSala` (`NumeroSala`);

--
-- Indices de la tabla `clase`
--
ALTER TABLE `clase`
  ADD PRIMARY KEY (`CodigoClase`),
  ADD KEY `NumeroSala` (`NumeroSala`),
  ADD KEY `DNIMonitor` (`DNIMonitor`);

--
-- Indices de la tabla `monitor`
--
ALTER TABLE `monitor`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `pistasquash`
--
ALTER TABLE `pistasquash`
  ADD PRIMARY KEY (`NumeroPista`);

--
-- Indices de la tabla `reservapistasquash`
--
ALTER TABLE `reservapistasquash`
  ADD PRIMARY KEY (`NumeroSocio`,`NumeroPista`,`Fecha`,`Hora`),
  ADD KEY `NumeroPista` (`NumeroPista`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`NumeroSala`);

--
-- Indices de la tabla `socio`
--
ALTER TABLE `socio`
  ADD PRIMARY KEY (`NumeroSocio`);

--
-- Indices de la tabla `socioclase`
--
ALTER TABLE `socioclase`
  ADD PRIMARY KEY (`NumeroSocio`,`CodigoClase`),
  ADD KEY `CodigoClase` (`CodigoClase`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aparato`
--
ALTER TABLE `aparato`
  ADD CONSTRAINT `aparato_ibfk_1` FOREIGN KEY (`NumeroSala`) REFERENCES `sala` (`NumeroSala`);

--
-- Filtros para la tabla `clase`
--
ALTER TABLE `clase`
  ADD CONSTRAINT `clase_ibfk_1` FOREIGN KEY (`NumeroSala`) REFERENCES `sala` (`NumeroSala`),
  ADD CONSTRAINT `clase_ibfk_2` FOREIGN KEY (`DNIMonitor`) REFERENCES `monitor` (`DNI`);

--
-- Filtros para la tabla `pistasquash`
--
ALTER TABLE `pistasquash`
  ADD CONSTRAINT `pistasquash_ibfk_1` FOREIGN KEY (`NumeroPista`) REFERENCES `sala` (`NumeroSala`);

--
-- Filtros para la tabla `reservapistasquash`
--
ALTER TABLE `reservapistasquash`
  ADD CONSTRAINT `reservapistasquash_ibfk_1` FOREIGN KEY (`NumeroSocio`) REFERENCES `socio` (`NumeroSocio`),
  ADD CONSTRAINT `reservapistasquash_ibfk_2` FOREIGN KEY (`NumeroPista`) REFERENCES `pistasquash` (`NumeroPista`);

--
-- Filtros para la tabla `socioclase`
--
ALTER TABLE `socioclase`
  ADD CONSTRAINT `socioclase_ibfk_1` FOREIGN KEY (`NumeroSocio`) REFERENCES `socio` (`NumeroSocio`),
  ADD CONSTRAINT `socioclase_ibfk_2` FOREIGN KEY (`CodigoClase`) REFERENCES `clase` (`CodigoClase`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
