-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 29, 2023 at 09:37 AM
-- Server version: 8.0.27
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projet_java_hmi`
--
CREATE DATABASE IF NOT EXISTS `projet_java_hmi` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `projet_java_hmi`;

-- --------------------------------------------------------

--
-- Table structure for table `demandeur`
--

DROP TABLE IF EXISTS `demandeur`;
CREATE TABLE IF NOT EXISTS `demandeur` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id == id de la table user_demandeur',
  `Num_demande` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'RG' COMMENT 'Num qui va permettre de referer la demande dans la table user_demandeur pour la connexion	',
  `civilite` text NOT NULL,
  `nom` text NOT NULL,
  `prenom` text NOT NULL,
  `date_naisssance` date NOT NULL,
  `lieu_naissance` text NOT NULL,
  `province_naissance` varchar(50) NOT NULL,
  `pays_naissance` varchar(50) NOT NULL,
  `profession` text NOT NULL,
  `nationalite_origine` text NOT NULL,
  `situation_famillialle` text NOT NULL,
  `adresse_residence` varchar(100) NOT NULL,
  `adresse_mail` varchar(100) NOT NULL,
  `tel` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'Numero avec indicatif du pays de residence',
  `type_demande` text NOT NULL,
  `date_du_jour` date NOT NULL,
  `ancien_num_matricule` varchar(5) NOT NULL DEFAULT 'RG' COMMENT 'Ancien numero de matricule CNI du demandeur',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `demandeur`
--

INSERT INTO `demandeur` (`id`, `Num_demande`, `civilite`, `nom`, `prenom`, `date_naisssance`, `lieu_naissance`, `province_naissance`, `pays_naissance`, `profession`, `nationalite_origine`, `situation_famillialle`, `adresse_residence`, `adresse_mail`, `tel`, `type_demande`, `date_du_jour`, `ancien_num_matricule`) VALUES
(1, 'RG001', 'Monsieur', 'Koumba', 'Stevy', '2023-01-04', 'Tchibanga', 'NYANGA', 'Gabon', 'Developpeur Fullstack', 'Gabonaise', 'Célibataire', 'Awendje', 'stevy@gmail.com', '0621722558', 'Nouvelle demande', '2023-01-19', ''),
(2, 'RG', 'Monsieur', 'OYE ESSENE', 'Tresor', '1980-01-11', 'Libreville', 'Estuaire', 'GABON', 'Developpeur Web et Mobile', 'Gabonaise', 'Marié', 'Beausejour', 'tresor@gmail.com', '+24125101520', 'Renouvellement', '2023-01-29', 'RG002');

-- --------------------------------------------------------

--
-- Table structure for table `user_agent`
--

DROP TABLE IF EXISTS `user_agent`;
CREATE TABLE IF NOT EXISTS `user_agent` (
  `code_agent` varchar(6) NOT NULL DEFAULT 'GA',
  `mdp` varchar(10) NOT NULL COMMENT 'mot de passe agent',
  PRIMARY KEY (`code_agent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `user_agent`
--

INSERT INTO `user_agent` (`code_agent`, `mdp`) VALUES
('GA0002', '2023'),
('GA2001', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `user_demandeur`
--

DROP TABLE IF EXISTS `user_demandeur`;
CREATE TABLE IF NOT EXISTS `user_demandeur` (
  `Num_demande` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'RG' COMMENT 'Num de la demande pour la connexion\r\n',
  PRIMARY KEY (`Num_demande`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `user_demandeur`
--

INSERT INTO `user_demandeur` (`Num_demande`) VALUES
('RG001');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
