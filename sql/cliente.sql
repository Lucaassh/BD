-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 15-Jun-2018 às 16:03
-- Versão do servidor: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cliente`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `nome` varchar(100) NOT NULL,
  `idade` int(10) NOT NULL,
  `CPF` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `sexo` varchar(100) NOT NULL,
  `id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`nome`, `idade`, `CPF`, `email`, `senha`, `sexo`, `id`) VALUES
('Lucas Pedro', 20, '45646875', 'lucas@outlook.com', '321', 'Masculino', 2),
('Lucas Pedro da Silva', 22, '490255620', 'pedro@outlook.com', '4241', 'Masculino', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `colaboradoras`
--

CREATE TABLE `colaboradoras` (
  `nome` varchar(100) NOT NULL,
  `idade` int(10) NOT NULL,
  `CPF` varchar(100) NOT NULL,
  `preferencia1` varchar(100) DEFAULT NULL,
  `preferencia2` varchar(100) DEFAULT NULL,
  `preferencia3` varchar(100) DEFAULT NULL,
  `sexo` varchar(100) NOT NULL,
  `id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `colaboradoras`
--

INSERT INTO `colaboradoras` (`nome`, `idade`, `CPF`, `preferencia1`, `preferencia2`, `preferencia3`, `sexo`, `id`) VALUES
('Joelma Celia', 22, '456115648', 'X - Tudo', 'X - Salada', 'X - Burguer', 'Feminino', 12),
('Marcao Rocha', 26, '465465465', 'X - Tudo', 'null', 'null', 'Masculino', 13),
('Sebastina Jubescreusa', 39, '5645812532', 'null', 'X - Salada', 'null', 'Feminino', 14),
('Candarata Oliveira', 49, '15612515', 'null', 'null', 'X - Burguer', 'Feminino', 15),
('Creusa Batista', 20, '5615465', 'X - Tudo', 'null', 'X - Burguer', 'Feminino', 16),
('Paloma Mastakiza', 32, '1354567', 'null', 'X - Salada', 'null', 'Feminino', 17);

-- --------------------------------------------------------

--
-- Estrutura da tabela `colaboradoraspreferencial1`
--

CREATE TABLE `colaboradoraspreferencial1` (
  `id` int(5) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `idade` int(10) NOT NULL,
  `CPF` varchar(100) NOT NULL,
  `preferencia1` varchar(100) DEFAULT NULL,
  `sexo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `colaboradoraspreferencial1`
--

INSERT INTO `colaboradoraspreferencial1` (`id`, `nome`, `idade`, `CPF`, `preferencia1`, `sexo`) VALUES
(12, 'Joelma Celia', 22, '456115648', 'X - Tudo', 'Feminino'),
(13, 'Marcão rocha', 26, '56156456', 'X - Tudo', 'Masculino'),
(14, 'Creusa Batista', 20, '5615465', 'X - Tudo', 'Feminino');

-- --------------------------------------------------------

--
-- Estrutura da tabela `colaboradoraspreferencial2`
--

CREATE TABLE `colaboradoraspreferencial2` (
  `id` int(5) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `idade` int(10) NOT NULL,
  `CPF` varchar(100) NOT NULL,
  `preferencia2` varchar(100) DEFAULT NULL,
  `sexo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `colaboradoraspreferencial2`
--

INSERT INTO `colaboradoraspreferencial2` (`id`, `nome`, `idade`, `CPF`, `preferencia2`, `sexo`) VALUES
(12, 'Joelma Celia', 22, '456115648', 'X - Salada', 'Feminino'),
(13, 'Sebastina Jubescreusa', 39, '5645812532', 'X - Salada', 'Feminino'),
(14, 'Paloma Mastakiza', 32, '1354567', 'X - Salada', 'Feminino');

-- --------------------------------------------------------

--
-- Estrutura da tabela `colaboradoraspreferencial3`
--

CREATE TABLE `colaboradoraspreferencial3` (
  `id` int(5) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `idade` int(10) NOT NULL,
  `CPF` varchar(100) NOT NULL,
  `preferencia3` varchar(100) DEFAULT NULL,
  `sexo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `colaboradoraspreferencial3`
--

INSERT INTO `colaboradoraspreferencial3` (`id`, `nome`, `idade`, `CPF`, `preferencia3`, `sexo`) VALUES
(12, 'Joelma Celia', 22, '456115648', 'X - Burguer', 'Feminino'),
(13, 'Candarata Oliveira', 49, '15612515', 'X - Burguer', 'Feminino'),
(14, 'Creusa Batista', 20, '5615465', 'X - Burguer', 'Feminino');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`nome`, `email`, `senha`, `id`) VALUES
('Lucas Pedro', 'lucas@outlook.com', '321', 2),
('Lucas Pedro da Silva', 'pedro@outlook.com', '4241', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `colaboradoras`
--
ALTER TABLE `colaboradoras`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `colaboradoraspreferencial1`
--
ALTER TABLE `colaboradoraspreferencial1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `colaboradoraspreferencial2`
--
ALTER TABLE `colaboradoraspreferencial2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `colaboradoraspreferencial3`
--
ALTER TABLE `colaboradoraspreferencial3`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `colaboradoras`
--
ALTER TABLE `colaboradoras`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `colaboradoraspreferencial1`
--
ALTER TABLE `colaboradoraspreferencial1`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `colaboradoraspreferencial2`
--
ALTER TABLE `colaboradoraspreferencial2`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `colaboradoraspreferencial3`
--
ALTER TABLE `colaboradoraspreferencial3`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
