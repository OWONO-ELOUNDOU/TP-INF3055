-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 20 jan. 2022 à 07:38
-- Version du serveur :  8.0.18
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `restaurant`
--

-- --------------------------------------------------------

--
-- Structure de la table `resto`
--

DROP TABLE IF EXISTS `resto`;
CREATE TABLE IF NOT EXISTS `resto` (
  `commande` varchar(30) NOT NULL,
  `choix` varchar(30) NOT NULL,
  `prix` varchar(30) NOT NULL,
  `quantiter` varchar(30) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `resto`
--

INSERT INTO `resto` (`commande`, `choix`, `prix`, `quantiter`, `total`) VALUES
('COMMANDE    PLAT', 'FRITE', '2.5€', '10', '25.0'),
('COMMANDE    PLAT', 'FRITE', '2.5€', '10', '25.0'),
('COMMANDE    PLAT', 'FRITE', '2.5€', '15', '37.5'),
('COMMANDE    PLAT', 'POULET', '3.5€', '3', '10.5'),
('COMMANDE   BOISSON', 'JUS', '3.5€', '1', '3.5'),
('COMMANDE    PLAT', 'SANDWICH', '3.7€', '1', '3.7'),
('COMMANDE   BOISSON', 'GLACE', '2.58€', '1', '2.58'),
('COMMANDE   BOISSON', 'COLA', '1.1€', '1', '1.1'),
('COMMANDE    PLAT', 'POULET', '3.5€', '0', '0.0'),
('COMMANDE   BOISSON', 'GLACE', '2.58€', '1', '2.58'),
('COMMANDE   BOISSON', 'COLA', '1.1€', '1', '1.1'),
('COMMANDE    PLAT', 'FRITE', '2.5€', '1', '2.5'),
('COMMANDE   BOISSON', 'GLACE', '2.58€', '1', '2.58'),
('COMMANDE    PLAT', 'FRITE', '2.5€', '20', '50.0'),
('COMMANDE    PLAT', 'SALADE', '5.5€', '2', '11.0'),
('COMMANDE    PLAT', 'SANDWICH', '3.7€', '3', '11.100000000000001'),
('COMMANDE    PLAT', 'FRITE', '2.5€', '7', '17.5'),
('COMMANDE    PLAT', 'SALADE', '5.5€', '1', '5.5'),
('COMMANDE   BOISSON', 'GLACE', '2.58€', '2', '5.16'),
('COMMANDE   BOISSON', 'COLA', '1.1€', '3', '3.3000000000000003'),
('COMMANDE    PLAT', 'SANDWICH', '3.7€', '4', '14.8'),
('COMMANDE    PLAT', 'FRITE', '2.5€', '2', '5.0'),
('COMMANDE    PLAT', 'SANDWICH', '3.7€', '1', '3.7'),
('COMMANDE   BOISSON', 'EAU', '0.92€', '1', '0.92');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
