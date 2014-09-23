-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 08, 2014 at 10:24 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `agent`
--

-- --------------------------------------------------------

--
-- Table structure for table `accountant`
--

CREATE TABLE IF NOT EXISTS `accountant` (
  `regid` varchar(10) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `company` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accountant`
--

INSERT INTO `accountant` (`regid`, `firstname`, `lastname`, `age`, `company`, `email`, `username`, `password`) VALUES
('AC01', 'Jagath', 'Kumara', 21, 'ABC', 'jagathk@gmail.com', 'Jagath', 'jagath@123');

-- --------------------------------------------------------

--
-- Table structure for table `agentdetails`
--

CREATE TABLE IF NOT EXISTS `agentdetails` (
  `regid` varchar(10) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `company` varchar(50) NOT NULL,
  `email` varchar(40) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agentdetails`
--

INSERT INTO `agentdetails` (`regid`, `firstname`, `lastname`, `age`, `company`, `email`, `username`, `password`) VALUES
('AG01', 'Kasun', 'Gamage', 24, 'ABC company', 'kasundgamage@gmail.com', 'Kasun', 'kasun@123');

-- --------------------------------------------------------

--
-- Table structure for table `rep`
--

CREATE TABLE IF NOT EXISTS `rep` (
  `regid` varchar(10) NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `company` varchar(50) NOT NULL,
  `email` varchar(40) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rep`
--

INSERT INTO `rep` (`regid`, `firstname`, `lastname`, `age`, `company`, `email`, `username`, `password`) VALUES
('RP01', 'Kamal', 'Perera', 26, 'ABC', 'kamal26@gmail.com', 'Kamal', 'kamal@123'),
('RP02', 'sdfd', 'sdgsd', 20, 'dfhdh', 'dfh@gfdg.fgjn', 'dghdgh', 'aaa'),
('RP03', 'qwefraf', 'adfad', 56, 'dfgdfg', 'dfgdf@iks.com', 'sdfgsfd', 'bbb');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
