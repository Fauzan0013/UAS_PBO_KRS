-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jan 2023 pada 10.07
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uaspbo_0013`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dosen`
--

CREATE TABLE `dosen` (
  `Nim` int(25) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Mata_kuliah` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dosen`
--

INSERT INTO `dosen` (`Nim`, `Nama`, `Mata_kuliah`) VALUES
(23456827, 'Gunadi S.Kom', 'Kecerdasan Buatan'),
(2010010079, 'Jahran S.T', 'Komunikasi'),
(2010014321, 'Haidar', 'Manajemen'),
(2010024355, 'Mahdy S.T', 'Rpl');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perhitungankrs`
--

CREATE TABLE `perhitungankrs` (
  `Nim` int(11) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Jurusan` varchar(50) NOT NULL,
  `Ipk` int(25) NOT NULL,
  `Total_Sks` int(50) NOT NULL,
  `Praktikum` int(50) NOT NULL,
  `Teori` int(50) NOT NULL,
  `Total_Bayar` int(255) NOT NULL,
  `Bayar` int(255) NOT NULL,
  `Kembali` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `perhitungankrs`
--

INSERT INTO `perhitungankrs` (`Nim`, `Nama`, `Jurusan`, `Ipk`, `Total_Sks`, `Praktikum`, `Teori`, `Total_Bayar`, `Bayar`, `Kembali`) VALUES
(2010010013, 'Fauzan', 'S1 Informatika', 4, 24, 1, 23, 4320000, 5000000, 680000),
(2010010076, 'Justin', 'S1 Informatika', 4, 24, 1, 23, 4320000, 4500000, 180000),
(2010010098, 'Gunadiii', 'S1 Informatika', 4, 24, 1, 23, 4320000, 5000000, 680000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `register`
--

CREATE TABLE `register` (
  `Username` varchar(25) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `akses` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `register`
--

INSERT INTO `register` (`Username`, `Password`, `akses`) VALUES
('admin', 'admin', 'admin'),
('Fauzan', '123456', 'user'),
('Mahdy', '123456', 'user');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`Nim`);

--
-- Indeks untuk tabel `perhitungankrs`
--
ALTER TABLE `perhitungankrs`
  ADD PRIMARY KEY (`Nim`);

--
-- Indeks untuk tabel `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`Username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `dosen`
--
ALTER TABLE `dosen`
  MODIFY `Nim` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2010024356;

--
-- AUTO_INCREMENT untuk tabel `perhitungankrs`
--
ALTER TABLE `perhitungankrs`
  MODIFY `Nim` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2010015556;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
