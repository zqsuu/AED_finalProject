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
-- Table structure for table `airplanetype`
--

DROP TABLE IF EXISTS `airplanetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `airplanetype` (
  `idairplanetype` int NOT NULL,
  `type` varchar(45) NOT NULL,
  `manufacturer` varchar(45) NOT NULL,
  `fuelconsumption` int NOT NULL,
  `first` int NOT NULL,
  `business` int NOT NULL,
  `eco` int NOT NULL,
  `price` int NOT NULL,
  PRIMARY KEY (`idairplanetype`),
  UNIQUE KEY `type_UNIQUE` (`type`),
  UNIQUE KEY `idairplanetype_UNIQUE` (`idairplanetype`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airplanetype`
--

LOCK TABLES `airplanetype` WRITE;
/*!40000 ALTER TABLE `airplanetype` DISABLE KEYS */;
INSERT INTO `airplanetype` VALUES (1,'BOEING777','Boeing',500,10,30,100,18000),(2,'BOEING787','Boeing',600,20,35,120,19000),(3,'BOEING797','Boeing',400,15,30,130,20000),(4,'BOEING999','Boeing',700,25,25,80,17000),(5,'BOEING676','Boeing',600,30,20,90,21000),(6,'AIRBUS320','Airbus',800,15,18,110,18000),(7,'AIRBUS321','Airbus',450,20,34,125,19000),(8,'AIRBUS800','Airbus',550,25,30,90,20000);
/*!40000 ALTER TABLE `airplanetype` ENABLE KEYS */;
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
