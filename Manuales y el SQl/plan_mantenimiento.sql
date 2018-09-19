-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-03-2018 a las 14:20:57
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `plan_mantenimiento`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calendario`
--

CREATE TABLE `calendario` (
  `CODIGO_CALENDARIO_MANTENIMIENTO` int(4) NOT NULL,
  `AÑO` int(4) DEFAULT NULL,
  `MES` int(2) DEFAULT NULL,
  `DIA` int(2) DEFAULT NULL,
  `CODIGO_MANTENIMIENTO` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `calendario`
--

INSERT INTO `calendario` (`CODIGO_CALENDARIO_MANTENIMIENTO`, `AÑO`, `MES`, `DIA`, `CODIGO_MANTENIMIENTO`) VALUES
(20, 2017, NULL, NULL, NULL),
(30, 2017, NULL, NULL, NULL),
(40, 2017, NULL, NULL, NULL),
(50, 2017, NULL, NULL, NULL),
(60, 2017, NULL, NULL, NULL),
(70, 2017, NULL, NULL, NULL),
(80, 2017, NULL, NULL, NULL),
(90, 2017, NULL, NULL, NULL),
(100, 2017, NULL, NULL, NULL),
(110, 2017, NULL, NULL, NULL),
(120, 2017, NULL, NULL, NULL),
(130, 2017, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargados`
--

CREATE TABLE `encargados` (
  `CODIGO_ENCARGADOS` int(4) NOT NULL,
  `NOMBRE` varchar(20) DEFAULT NULL,
  `GRADO` varchar(20) DEFAULT NULL,
  `SALARIO` decimal(5,0) DEFAULT NULL,
  `CODIGO_MANTENIMIENTO` int(4) DEFAULT NULL,
  `FUNTIONAL_PLACE` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `encargados`
--

INSERT INTO `encargados` (`CODIGO_ENCARGADOS`, `NOMBRE`, `GRADO`, `SALARIO`, `CODIGO_MANTENIMIENTO`, `FUNTIONAL_PLACE`) VALUES
(123, 'roberto', 'JEFE DE MANTENIMIENT', '50000', 100, 209),
(1234, 'A', 'INGENIERO ENCARGADO', '50000', 200, 210),
(1235, 'B', 'INGENIERO ENCARGADO', '50000', 300, 211),
(1236, 'C', 'INGENIERO ENCARGADO', '50000', 400, 212),
(1237, 'D', 'INGENIERO ENCARGADO', '50000', 500, 213);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `CODIGO_PIEZA` int(6) NOT NULL,
  `DETALLES` varchar(50) DEFAULT NULL,
  `SECCION` varchar(50) DEFAULT NULL,
  `FUNTIONAL_PLACE` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`CODIGO_PIEZA`, `DETALLES`, `SECCION`, `FUNTIONAL_PLACE`) VALUES
(10000, 'TAMBOR DE ACCIONAMIENTO', '#1', 209),
(10010, 'TAMBOR DE APRIETE', '#1', 209),
(10020, 'TAMBOR DE REENVIO', '#1', 209),
(10030, 'LAMINAS PARA RASCADOR', '#1', 209),
(10040, 'RODILLO SUPERIOR LIZO', '#1', 209),
(10050, 'CINTA', '#1', 209),
(10060, 'INTERRUPTOR DE EMERGENCIA', '#1', 209),
(10070, 'TB-650', '#2', 210),
(10080, 'TAMBOR DE ACCIONAMIENTO', '#2', 210),
(10090, 'TAMBOR TENSOR', '#2', 210),
(10100, 'BANDA', '#2', 210),
(10110, 'DETECTOR DE MOVIMIENTO', '#2', 210),
(10120, 'PLACA DE GAMA', '#2', 210),
(10130, 'CINTA DE PASAJE', '#2', 210),
(20140, 'JUEGO DE MONTAJE', '#2', 210),
(20150, 'CINTA HERMETIZANTE', '#3', 211),
(20160, 'TELA METALICA', '#3', 211),
(20170, 'TEJIDO POROSO', '#3', 211),
(20180, 'MANGA FILTRANTE', '#3', 211),
(20190, 'VALVULA PARA TUVERIA', '#3', 211),
(20200, 'MANOMETRO', '#3', 211),
(20210, 'BOBINA DE REACCTANCIA CAPILAR', '#3', 211),
(20220, 'CORREA TRAPEZOIDAL', '#3', 211),
(20230, 'CASTILLO PROTECTOR DE EJE', '#3', 211),
(20240, 'MEMBRANA', '#4', 212),
(20250, 'MUELLE DE HOJA', '#4', 212),
(20255, 'MUELLE DE HOJA', '#4', 212),
(20260, 'RESVALADORA DE MEDICION', '#4', 212),
(20270, 'VALVULA NEUMATICA ESFERICA', '#4', 212),
(20280, 'APOYO', '#5', 213),
(20290, 'RODAMIENTO DE NUDILLO ARROTENSOR', '#5', 214),
(20300, 'TERMOMETRO DE RESISTENCIA', '#5', 213),
(20310, 'ACCESORIOS PARA QUEMADOR', '#6', 214),
(20320, 'COMPUERTA DE CIERRE', '#6', 214),
(20330, 'MANOMETRO MECANICO', '#6', 214),
(20340, 'REGULADOR DE FILTRO', '#6', 214),
(20350, 'CONTROLADOR DE LLAMA', '#6', 214),
(20360, 'DETECTOR DE LLAMA UV', '#6', 214),
(20370, 'SOPLANTE DE CANAL LATERAL', '#6', 214),
(20380, 'TOMBERA DE GAS', '#6', 214),
(20390, 'PIEZAS DE AJUSTES', '#6', 214),
(20400, NULL, '#7', 215),
(20410, NULL, '#7', 215),
(20420, NULL, '#7', 215),
(30250, 'MUELLE DE HOJA', '#4', 212),
(30260, 'RESVALADORA DE MEDICION', '#4', 212),
(30950, 'MUELLE DE HOJA', '#4', 212),
(30960, 'RESVALADORA DE MEDICION', '#4', 212),
(30970, 'VALVULA NEUMATICA ESFERICA', '#4', 212),
(30980, 'APOYO', '#5', 213),
(30990, 'RODAMIENTO DE NUDILLO ARROTENSOR', '#5', 214),
(31000, 'TERMOMETRO DE RESISTENCIA', '#5', 213),
(31310, 'ACCESORIOS PARA QUEMADOR', '#6', 214),
(41320, 'COMPUERTA DE CIERRE', '#6', 214),
(41330, 'MANOMETRO MECANICO', '#6', 214),
(41340, 'REGULADOR DE FILTRO', '#6', 214),
(41350, 'CONTROLADOR DE LLAMA', '#6', 214),
(41360, 'DETECTOR DE LLAMA UV', '#6', 214),
(41370, 'SOPLANTE DE CANAL LATERAL', '#6', 214),
(41380, 'TOMBERA DE GAS', '#6', 214),
(41390, 'PIEZAS DE AJUSTES', '#6', 214),
(51400, NULL, '#7', 215),
(51410, NULL, '#7', 215),
(51420, NULL, '#7', 215),
(51430, NULL, '#8', 215),
(51440, NULL, '#8', 215),
(51450, NULL, '#8', 215),
(51460, NULL, '#n', 215),
(51470, NULL, '#n', 215);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `linea2`
--

CREATE TABLE `linea2` (
  `FUNTIONAL_PLACE` int(4) NOT NULL,
  `SECCION` varchar(50) DEFAULT NULL,
  `PROCESO` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `linea2`
--

INSERT INTO `linea2` (`FUNTIONAL_PLACE`, `SECCION`, `PROCESO`) VALUES
(209, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', '#1'),
(210, 'TRANSPORTE HACIA MOLIENDA DE CRUDO', '#2'),
(211, 'SILO DE HARINA DE CRUDO', '#3'),
(212, 'SISTEMA PRECALENTADOR', '#4'),
(213, 'HORNO', '#5'),
(214, 'ENFRIADOR', '#6'),
(215, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', '#7');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimiento`
--

CREATE TABLE `mantenimiento` (
  `CODIGO_MANTENIMIENTO` int(4) NOT NULL,
  `MANTENIMIENTO_RUTINARIO` varchar(30) DEFAULT NULL,
  `MANTENIMIENTO_NO_RUTINARIO` text,
  `MANTENIMIENTO_PREVENTIVO` text,
  `FUNTIONAL_PLACE` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mantenimiento`
--

INSERT INTO `mantenimiento` (`CODIGO_MANTENIMIENTO`, `MANTENIMIENTO_RUTINARIO`, `MANTENIMIENTO_NO_RUTINARIO`, `MANTENIMIENTO_PREVENTIVO`, `FUNTIONAL_PLACE`) VALUES
(100, NULL, NULL, NULL, 209),
(200, NULL, NULL, NULL, 210),
(300, NULL, NULL, NULL, 211),
(400, NULL, NULL, NULL, 212),
(500, NULL, NULL, NULL, 213),
(600, NULL, NULL, NULL, 209),
(700, NULL, NULL, NULL, 209),
(1010, NULL, NULL, 'Cambio_aceite_motor', NULL),
(1122, 'Manejar_Volqueta', NULL, NULL, NULL),
(1255, 'cargar', NULL, NULL, NULL),
(2233, 'Manejar', NULL, NULL, NULL),
(3568, '(Cambiar', NULL, NULL, NULL),
(4532, NULL, NULL, 'cambio_aceite', NULL),
(5220, 'cargar', NULL, NULL, NULL),
(6689, 'Cambiar', NULL, NULL, NULL),
(7676, 'cargar', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquinaria`
--

CREATE TABLE `maquinaria` (
  `CODIGO_MAQUINARIA` int(4) NOT NULL,
  `DESCRIPCION` varchar(50) DEFAULT NULL,
  `CODIGO_PIEZA` int(6) DEFAULT NULL,
  `FUNTIONAL_PLACE` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `maquinaria`
--

INSERT INTO `maquinaria` (`CODIGO_MAQUINARIA`, `DESCRIPCION`, `CODIGO_PIEZA`, `FUNTIONAL_PLACE`) VALUES
(1000, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', 10000, 209),
(1001, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', 10010, 209),
(1002, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', 10020, 209),
(1008, 'TRANSPORTE HACIA MOLIENDA DE CRUDO', 10080, 210),
(1009, 'TRANSPORTE HACIA MOLIENDA DE CRUDO', 10090, 210),
(1010, 'TRANSPORTE HACIA MOLIENDA DE CRUDO', 10100, 210),
(1014, 'SILO DE HARINA DE CRUDO', 20150, 211),
(1015, 'SILO DE HARINA DE CRUDO', 20160, 211),
(1016, 'SILO DE HARINA DE CRUDO', 20170, 211),
(1018, 'SISTEMA PRECALENTADOR', 20190, 212),
(1019, 'SISTEMA PRECALENTADOR', 20200, 212),
(1020, 'SISTEMA PRECALENTADOR', 20210, 212),
(1021, 'HORNO', 20220, 213),
(1022, 'HORNO', 20230, 213),
(1023, 'HORNO', 20240, 213),
(1024, 'ENFRIADOR', 20250, 214),
(1025, 'ENFRIADOR', 20260, 214),
(1026, 'ENFRIADOR', 20270, 214),
(1027, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', 20280, 215),
(1028, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', 20290, 215),
(1029, 'TRANSPORTE HACIA TOLVA DE ALIMENTACION', 20300, 215);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros_residencia_trabajadores`
--

CREATE TABLE `registros_residencia_trabajadores` (
  `CODIGO_CIUDAD` int(2) NOT NULL,
  `NOMBRE_CIUDAD` varchar(50) DEFAULT NULL,
  `DEPARTAMENTO` varchar(50) DEFAULT NULL,
  `PAIS` varchar(50) DEFAULT NULL,
  `CODIGO_TRABAJADOR` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registros_residencia_trabajadores`
--

INSERT INTO `registros_residencia_trabajadores` (`CODIGO_CIUDAD`, `NOMBRE_CIUDAD`, `DEPARTAMENTO`, `PAIS`, `CODIGO_TRABAJADOR`) VALUES
(10, 'cercado', 'cochabamba', 'bolivia', 7111);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE `trabajadores` (
  `CODIGO_TRABAJADOR` int(4) NOT NULL,
  `NOMBRE` varchar(25) DEFAULT NULL,
  `TRABAJO` varchar(25) DEFAULT NULL,
  `SALARIO` int(5) DEFAULT NULL,
  `DEPENDIENTE` int(4) DEFAULT NULL,
  `FUNTIONAL_PLACE` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajadores`
--

INSERT INTO `trabajadores` (`CODIGO_TRABAJADOR`, `NOMBRE`, `TRABAJO`, `SALARIO`, `DEPENDIENTE`, `FUNTIONAL_PLACE`) VALUES
(7111, 'SERGIO', 'ELECTRICISTA', 1578, 8887, 215),
(7289, 'MARCELO', 'INSTRUMENTISTA', 1600, 8887, 213),
(7485, 'SAMANTA', 'MECANICO', 1900, 6669, 214),
(7854, 'SARA', 'ELECTRICISTA', 2000, 8887, 211),
(7857, 'PEDRO', 'MECANICO', 1578, 8887, 210),
(7947, 'ALEJANDRO', 'INSTRUMENTISTA', 2540, 6669, 212);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `calendario`
--
ALTER TABLE `calendario`
  ADD PRIMARY KEY (`CODIGO_CALENDARIO_MANTENIMIENTO`),
  ADD KEY `CODIGO_MANTENIMIENTO` (`CODIGO_MANTENIMIENTO`);

--
-- Indices de la tabla `encargados`
--
ALTER TABLE `encargados`
  ADD PRIMARY KEY (`CODIGO_ENCARGADOS`),
  ADD KEY `CODIGO_MANTENIMIENTO` (`CODIGO_MANTENIMIENTO`),
  ADD KEY `FUNTIONAL_PLACE` (`FUNTIONAL_PLACE`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`CODIGO_PIEZA`),
  ADD KEY `FUNTIONAL_PLACE` (`FUNTIONAL_PLACE`);

--
-- Indices de la tabla `linea2`
--
ALTER TABLE `linea2`
  ADD PRIMARY KEY (`FUNTIONAL_PLACE`);

--
-- Indices de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD PRIMARY KEY (`CODIGO_MANTENIMIENTO`),
  ADD KEY `FUNTIONAL_PLACE` (`FUNTIONAL_PLACE`);

--
-- Indices de la tabla `maquinaria`
--
ALTER TABLE `maquinaria`
  ADD PRIMARY KEY (`CODIGO_MAQUINARIA`),
  ADD KEY `CODIGO_PIEZA` (`CODIGO_PIEZA`),
  ADD KEY `FUNTIONAL_PLACE` (`FUNTIONAL_PLACE`);

--
-- Indices de la tabla `registros_residencia_trabajadores`
--
ALTER TABLE `registros_residencia_trabajadores`
  ADD PRIMARY KEY (`CODIGO_CIUDAD`),
  ADD KEY `CODIGO_TRABAJADOR` (`CODIGO_TRABAJADOR`);

--
-- Indices de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD PRIMARY KEY (`CODIGO_TRABAJADOR`),
  ADD KEY `FUNTIONAL_PLACE` (`FUNTIONAL_PLACE`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `calendario`
--
ALTER TABLE `calendario`
  ADD CONSTRAINT `calendario_ibfk_1` FOREIGN KEY (`CODIGO_MANTENIMIENTO`) REFERENCES `mantenimiento` (`CODIGO_MANTENIMIENTO`);

--
-- Filtros para la tabla `encargados`
--
ALTER TABLE `encargados`
  ADD CONSTRAINT `encargados_ibfk_1` FOREIGN KEY (`CODIGO_MANTENIMIENTO`) REFERENCES `mantenimiento` (`CODIGO_MANTENIMIENTO`),
  ADD CONSTRAINT `encargados_ibfk_2` FOREIGN KEY (`FUNTIONAL_PLACE`) REFERENCES `linea2` (`FUNTIONAL_PLACE`);

--
-- Filtros para la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD CONSTRAINT `inventario_ibfk_1` FOREIGN KEY (`FUNTIONAL_PLACE`) REFERENCES `linea2` (`FUNTIONAL_PLACE`);

--
-- Filtros para la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD CONSTRAINT `mantenimiento_ibfk_1` FOREIGN KEY (`FUNTIONAL_PLACE`) REFERENCES `linea2` (`FUNTIONAL_PLACE`);

--
-- Filtros para la tabla `maquinaria`
--
ALTER TABLE `maquinaria`
  ADD CONSTRAINT `maquinaria_ibfk_1` FOREIGN KEY (`CODIGO_PIEZA`) REFERENCES `inventario` (`CODIGO_PIEZA`),
  ADD CONSTRAINT `maquinaria_ibfk_2` FOREIGN KEY (`FUNTIONAL_PLACE`) REFERENCES `linea2` (`FUNTIONAL_PLACE`);

--
-- Filtros para la tabla `registros_residencia_trabajadores`
--
ALTER TABLE `registros_residencia_trabajadores`
  ADD CONSTRAINT `registros_residencia_trabajadores_ibfk_1` FOREIGN KEY (`CODIGO_TRABAJADOR`) REFERENCES `trabajadores` (`CODIGO_TRABAJADOR`);

--
-- Filtros para la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD CONSTRAINT `trabajadores_ibfk_1` FOREIGN KEY (`FUNTIONAL_PLACE`) REFERENCES `linea2` (`FUNTIONAL_PLACE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
