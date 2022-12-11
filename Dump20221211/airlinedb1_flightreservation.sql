-- MySQL dump 10.13  Distrib 8.0.31, for macos12 (x86_64)
--
-- Host: localhost    Database: airlinedb1
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `flightreservation`
--

DROP TABLE IF EXISTS `flightreservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flightreservation` (
  `idreservation` int NOT NULL,
  `passengername` varchar(45) NOT NULL,
  `passport` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `company` varchar(45) NOT NULL,
  `route` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `class` varchar(45) NOT NULL,
  `price` int NOT NULL,
  `seat` varchar(45) NOT NULL,
  `reservationid` varchar(45) NOT NULL,
  PRIMARY KEY (`idreservation`),
  UNIQUE KEY `reservationid_UNIQUE` (`reservationid`),
  UNIQUE KEY `idreservation_UNIQUE` (`idreservation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flightreservation`
--

LOCK TABLES `flightreservation` WRITE;
/*!40000 ALTER TABLE `flightreservation` DISABLE KEYS */;
INSERT INTO `flightreservation` VALUES (1,'Bob','A356367','2022-12-25 00:00:00','Cape Air','CA100','purchased','first',3500,'1A','JCOW2KC4');
/*!40000 ALTER TABLE `flightreservation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-11  5:10:58
