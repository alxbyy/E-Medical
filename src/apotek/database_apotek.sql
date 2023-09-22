-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2022 at 07:31 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_apotek`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `ID` int(100) NOT NULL,
  `Nama` varchar(64) NOT NULL,
  `Obat` varchar(64) NOT NULL,
  `Jumlah` int(64) NOT NULL,
  `Tanggal` varchar(64) NOT NULL,
  `Total_Harga` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ID`, `Nama`, `Obat`, `Jumlah`, `Tanggal`, `Total_Harga`) VALUES
(20, 'nabiha', 'Intunal', 4, '2022-12-01', 100000),
(21, 'nabiha', 'Intunal', 2, '2022-12-01', 50000),
(22, 'nabiha', 'Intunal', 2, '2022-12-01', 50000),
(23, 'nabiha', 'Intunal', 2, '2022-12-01', 30000),
(24, 'nabiha', 'Paracetamol', 2, '2022-12-02', 10000),
(25, 'test', 'VitaminC', 2, '2022-12-02', 60000),
(26, 'test2', 'Lasal', 4, '2022-12-02', 72000),
(27, 'test3', 'VitaminC', 5, '2022-12-02', 150000);

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `ID` char(6) NOT NULL,
  `Nama` varchar(64) NOT NULL,
  `Jabatan` varchar(64) NOT NULL,
  `NoTelp` varchar(64) NOT NULL,
  `Gaji` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`ID`, `Nama`, `Jabatan`, `NoTelp`, `Gaji`) VALUES
('APT111', 'Siti', 'Apoteker', '085710987563', 10000000),
('PMB192', 'Abi', 'Seksi_Pembelian', '081388865347', 4000000);

-- --------------------------------------------------------

--
-- Table structure for table `stockobat`
--

CREATE TABLE `stockobat` (
  `ID` int(64) NOT NULL,
  `Nama` varchar(64) NOT NULL,
  `Harga` int(64) NOT NULL,
  `Stock` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stockobat`
--

INSERT INTO `stockobat` (`ID`, `Nama`, `Harga`, `Stock`) VALUES
(1, 'Paracetamol', 5000, 75),
(2, 'OBH', 25000, 75),
(3, 'Intunal', 15000, 98),
(4, 'VitaminC', 30000, 93),
(5, 'Lasal', 18000, 96);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `stockobat`
--
ALTER TABLE `stockobat`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `stockobat`
--
ALTER TABLE `stockobat`
  MODIFY `ID` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
