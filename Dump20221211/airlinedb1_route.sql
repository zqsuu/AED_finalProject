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
-- Table structure for table `route`
--

DROP TABLE IF EXISTS `route`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `route` (
  `idkey` int NOT NULL,
  `routename` varchar(45) NOT NULL,
  `company` varchar(45) NOT NULL,
  `departureairport` varchar(45) NOT NULL,
  `fallairport` varchar(45) NOT NULL,
  `departuretime` varchar(45) NOT NULL,
  `falltime` varchar(45) NOT NULL,
  `departureterminal` varchar(45) NOT NULL,
  `fallterminal` varchar(45) NOT NULL,
  `flytime` int NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `firstprice` int NOT NULL,
  `businessprice` int NOT NULL,
  `economyprice` int NOT NULL,
  `baggage` varchar(45) NOT NULL,
  PRIMARY KEY (`idkey`),
  UNIQUE KEY `routename_UNIQUE` (`routename`),
  UNIQUE KEY `idkey_UNIQUE` (`idkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `route`
--

LOCK TABLES `route` WRITE;
/*!40000 ALTER TABLE `route` DISABLE KEYS */;
INSERT INTO `route` VALUES (1,'AC111','Air Canada','Logan(BOS)','LA','7:00','11:00','A','A',7,NULL,3000,1500,1000,'1'),(2,'AC222','Air Canada','LA','Logan(BOS)','15:00','0:00(+1)','A','B',7,NULL,4000,2000,1200,'1'),(3,'CA100','Cape Air','Logan(BOS)','PEK','10:00','8:00(+2)','B','B',16,NULL,3500,3000,1500,'2'),(4,'AM479','American','LA','PEK','16:00','14:00(+2)','C','A',25,NULL,4500,3500,2000,'2'),(5,'AM25','American','PEK','LA','12:30','23:00(+1)','A','B',18,NULL,2700,2000,1000,'1'),(6,'AC78','Air Canada','Toronto','LA','10:30','11:30','B','A',4,NULL,3000,2000,1000,'1'),(7,'AM100','American','Logan(BOS)','PEK','1:00','6:00(+1)','C','C',20,NULL,2800,2000,1600,'2'),(8,'AC330','Air Canada','LA','Toronto','19:00','23:30','A','C',6,NULL,2500,1700,1200,'2');
/*!40000 ALTER TABLE `route` ENABLE KEYS */;
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
