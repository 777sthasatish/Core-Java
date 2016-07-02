-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2016 at 07:17 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `blood_bank_mgmt_sys`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_blood_hospital`
--

CREATE TABLE IF NOT EXISTS `tbl_blood_hospital` (
  `HBID` int(11) NOT NULL AUTO_INCREMENT,
  `Hospital_Name` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Blood_Group` varchar(5) NOT NULL,
  `Blood_Packet` int(11) NOT NULL,
  PRIMARY KEY (`HBID`),
  UNIQUE KEY `HBID` (`HBID`),
  KEY `BloodId` (`Hospital_Name`),
  KEY `hospital_Id` (`Hospital_Name`),
  KEY `Name` (`Name`),
  KEY `Blood_Group` (`Blood_Group`),
  KEY `Hospital_Name` (`Hospital_Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tbl_blood_hospital`
--

INSERT INTO `tbl_blood_hospital` (`HBID`, `Hospital_Name`, `Name`, `Blood_Group`, `Blood_Packet`) VALUES
(1, 'Nepal Medical College', 'cxzvcx', 'A-', 2),
(2, 'Nepal Medical College', 'ffdsa', 'A+', 2),
(3, 'Nepal Medical College', 'Sijan Shrestha', 'AB+', 4),
(4, 'Nepal Medical College', 'Sijan Shrestha', 'AB+', 5),
(5, 'Nepal Medical College', 'Sijan Shrestha', 'AB+', 5);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_blood_type`
--

CREATE TABLE IF NOT EXISTS `tbl_blood_type` (
  `BloodId` int(11) NOT NULL AUTO_INCREMENT,
  `Blood_Group` varchar(5) NOT NULL,
  PRIMARY KEY (`BloodId`),
  KEY `BloodId` (`BloodId`),
  KEY `Blood_Group` (`Blood_Group`),
  KEY `Blood_Group_2` (`Blood_Group`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `tbl_blood_type`
--

INSERT INTO `tbl_blood_type` (`BloodId`, `Blood_Group`) VALUES
(11, 'A+'),
(12, 'A-'),
(15, 'AB+'),
(16, 'AB-'),
(13, 'B+'),
(14, 'B-'),
(9, 'O+'),
(10, 'O-');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_donor`
--

CREATE TABLE IF NOT EXISTS `tbl_donor` (
  `DID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Age` int(3) NOT NULL,
  `Weight` int(3) NOT NULL,
  `Home_Address` varchar(50) NOT NULL,
  `Official_Address` varchar(50) NOT NULL,
  `Ph_No` varchar(15) NOT NULL,
  `Office_No` varchar(15) NOT NULL,
  `Mobile_No` varchar(15) NOT NULL,
  `EMail` varchar(50) NOT NULL,
  `Blood_Group` varchar(5) NOT NULL,
  PRIMARY KEY (`DID`),
  UNIQUE KEY `BloodGroup` (`Blood_Group`),
  KEY `BloodId` (`Blood_Group`),
  KEY `BloodId_2` (`Blood_Group`),
  KEY `Name` (`Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `tbl_donor`
--

INSERT INTO `tbl_donor` (`DID`, `Name`, `Gender`, `Age`, `Weight`, `Home_Address`, `Official_Address`, `Ph_No`, `Office_No`, `Mobile_No`, `EMail`, `Blood_Group`) VALUES
(12, 'Satish', 'Male', 22, 59, 'Gokarna, KTM', 'Gokarna, KTM', '014801220', '014801220', '9840068985', 'parth1hell@gmail.com', 'O+'),
(13, 'Sanjay Koirala', 'Male', 22, 55, 'Gorkha', 'Gorkha', '014456512', '014456512', '9840021156', 'sanjay@gmail.com', 'A+'),
(14, 'Sulav Dhungana', 'Male', 22, 70, 'Basudhara-11, Kathmandu', 'Basudhara-11, Kathmandu', '014455789', '014455456', '9841546658', 'sulvav_dhug@gmail.com', 'A-');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_donor_blood`
--

CREATE TABLE IF NOT EXISTS `tbl_donor_blood` (
  `DBID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Blood_Group` varchar(5) NOT NULL,
  `Blood_Packet` int(11) NOT NULL,
  `Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`DBID`),
  KEY `DID` (`Blood_Group`),
  KEY `BloodId` (`Blood_Group`),
  KEY `Name` (`Name`),
  KEY `Blood_Group` (`Blood_Group`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `tbl_donor_blood`
--

INSERT INTO `tbl_donor_blood` (`DBID`, `Name`, `Blood_Group`, `Blood_Packet`, `Date`) VALUES
(1, 'Satish', 'O+', 2, '2016-04-13 18:15:00'),
(2, 'Sanjay Koirala', 'A+', 3, '2016-04-10 18:15:00'),
(3, 'Sanjay Koirala', 'A+', 2, '2016-04-15 18:15:00'),
(4, 'Satish', 'O+', 2, '2016-04-14 18:15:00'),
(5, 'Sanjay Koirala', 'A+', 2, '2016-04-21 18:15:00'),
(6, 'Sanjay Koirala', 'A+', 2, '2016-04-20 18:15:00'),
(7, 'Satish', 'O+', 4, '2016-04-20 18:15:00'),
(8, 'Sulav Dhungana', 'A-', 4, '2016-04-20 18:15:00'),
(9, 'Sulav Dhungana', 'A-', 2, '2016-04-07 18:15:00');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_hospital`
--

CREATE TABLE IF NOT EXISTS `tbl_hospital` (
  `hospital_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Hospital_Name` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Ph_No` varchar(15) NOT NULL,
  `EMail` varchar(50) NOT NULL,
  PRIMARY KEY (`hospital_Id`),
  KEY `Hospital_Name` (`Hospital_Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tbl_hospital`
--

INSERT INTO `tbl_hospital` (`hospital_Id`, `Hospital_Name`, `Location`, `Ph_No`, `EMail`) VALUES
(1, 'Nepal Medical College', 'Gokarna, Kathmandu', '014805565', 'NepalMedi@yahoo.com'),
(2, 'afds', 'fdsa', '344434343', 'fdas'),
(3, 'dfhsaj', 'fjdksl', '444444444', 'jfdklsajklfjads'),
(4, 'OM Hospital', 'Chabahil, Kathmandu', '014451252', 'om124@yahoo.com'),
(5, 'Norvic Hospital', 'Thapathali, Kathmandu', '014258554', 'norvic@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_login`
--

CREATE TABLE IF NOT EXISTS `tbl_login` (
  `LogID` int(11) NOT NULL AUTO_INCREMENT,
  `User_Name` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `U_Id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`LogID`),
  KEY `U_Id` (`U_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `tbl_login`
--

INSERT INTO `tbl_login` (`LogID`, `User_Name`, `Password`, `U_Id`) VALUES
(1, 'admin', 'admin', 1),
(2, 'registrar', 'registrar', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patient`
--

CREATE TABLE IF NOT EXISTS `tbl_patient` (
  `PID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Age` int(11) NOT NULL,
  `Weight` int(11) NOT NULL,
  `Home_Address` varchar(50) NOT NULL,
  `Official_Address` varchar(50) NOT NULL,
  `Ph_No` varchar(15) NOT NULL,
  `Office_No` varchar(15) NOT NULL,
  `Mobile_No` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Blood_Group` varchar(5) NOT NULL,
  `Hospital_Name` varchar(50) NOT NULL,
  PRIMARY KEY (`PID`),
  KEY `BloodId` (`Blood_Group`),
  KEY `Hospital_Name` (`Hospital_Name`),
  KEY `Name` (`Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `tbl_patient`
--

INSERT INTO `tbl_patient` (`PID`, `Name`, `Gender`, `Age`, `Weight`, `Home_Address`, `Official_Address`, `Ph_No`, `Office_No`, `Mobile_No`, `Email`, `Blood_Group`, `Hospital_Name`) VALUES
(9, 'ffdsa', 'Male', 43, 43, 'dfsa', 'fdsa', '434343434', '434343434', '4343434343', 'fdsa', 'O+', 'afds'),
(10, 'cxzvcx', 'Female', 32, 56, 'fdsgfds', 'fdsgfds', '432444444', '432444444', '4324444442', 'fdsgfds', 'A-', 'Nepal Medical College'),
(13, 'Sijan Shrestha', 'Male', 20, 75, 'Gokarna-06, Kathmandu', 'Gokarna-06, Kathmandu', '014801220', '014801220', '9868194018', 'sijan@gmail.com', 'AB+', 'Nepal Medical College');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_usertype`
--

CREATE TABLE IF NOT EXISTS `tbl_usertype` (
  `U_Id` int(11) NOT NULL,
  `User_Type` varchar(50) NOT NULL,
  PRIMARY KEY (`U_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_usertype`
--

INSERT INTO `tbl_usertype` (`U_Id`, `User_Type`) VALUES
(1, 'Admin'),
(2, 'Registrar');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_blood_hospital`
--
ALTER TABLE `tbl_blood_hospital`
  ADD CONSTRAINT `tbl_blood_hospital_ibfk_1` FOREIGN KEY (`Hospital_Name`) REFERENCES `tbl_hospital` (`Hospital_Name`),
  ADD CONSTRAINT `tbl_blood_hospital_ibfk_2` FOREIGN KEY (`Blood_Group`) REFERENCES `tbl_blood_type` (`Blood_Group`),
  ADD CONSTRAINT `tbl_blood_hospital_ibfk_3` FOREIGN KEY (`Name`) REFERENCES `tbl_patient` (`Name`);

--
-- Constraints for table `tbl_donor`
--
ALTER TABLE `tbl_donor`
  ADD CONSTRAINT `tbl_donor_ibfk_1` FOREIGN KEY (`Blood_Group`) REFERENCES `tbl_blood_type` (`Blood_Group`);

--
-- Constraints for table `tbl_donor_blood`
--
ALTER TABLE `tbl_donor_blood`
  ADD CONSTRAINT `tbl_donor_blood_ibfk_2` FOREIGN KEY (`Blood_Group`) REFERENCES `tbl_blood_type` (`Blood_Group`),
  ADD CONSTRAINT `tbl_donor_blood_ibfk_1` FOREIGN KEY (`Name`) REFERENCES `tbl_donor` (`Name`);

--
-- Constraints for table `tbl_login`
--
ALTER TABLE `tbl_login`
  ADD CONSTRAINT `tbl_login_ibfk_1` FOREIGN KEY (`U_Id`) REFERENCES `tbl_usertype` (`U_Id`);

--
-- Constraints for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD CONSTRAINT `tbl_patient_ibfk_3` FOREIGN KEY (`Blood_Group`) REFERENCES `tbl_blood_type` (`Blood_Group`),
  ADD CONSTRAINT `tbl_patient_ibfk_2` FOREIGN KEY (`Hospital_Name`) REFERENCES `tbl_hospital` (`Hospital_Name`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
