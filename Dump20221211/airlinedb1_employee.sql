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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `idemployee` int NOT NULL,
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `company` varchar(45) NOT NULL,
  `route` varchar(45) DEFAULT NULL,
  `gender` varchar(45) NOT NULL,
  `age` int NOT NULL,
  `role` varchar(45) NOT NULL,
  `flyyears` int NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idemployee`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,135,'Sue','American',NULL,'Female',25,'Steward/Stewardess',2,'Sue123'),(2,246,'Richard','American',NULL,'Male',30,'Steward/Stewardess',5,'Richard123'),(3,157,'Lynn','American',NULL,'Female',35,'Captain',10,'Lynn123'),(4,213,'Lee','American',NULL,'Male',32,'Pilot',7,'Lee123'),(5,289,'Zack','American',NULL,'Male',34,'Pilot',8,'Zack123'),(6,58,'Rohn','American',NULL,'Male',54,'Captain',20,'Robin123'),(7,219,'Roy','American',NULL,'Male',32,'Pilot',7,'Roy123'),(8,269,'Michle','American',NULL,'Male',45,'Captain',20,'Michle123'),(9,465,'Archie','American',NULL,'Male',35,'Steward/Stewardess',13,'Archie123'),(10,456,'Brendan','American',NULL,'Male',45,'Pilot',13,'Brendan123'),(11,271,'Benjamin','American',NULL,'Male',27,'Steward/Stewardess',23,'Benjamin123'),(12,158,'Althea','American',NULL,'Female',28,'Steward/Stewardess',7,'Althea123'),(13,54,'Ator','Air Canada',NULL,'Female',20,'Steward/Stewardess',1,'Ator123'),(14,245,'Damario','Air Canada',NULL,'Female',25,'Steward/Stewardess',2,'Damario123'),(15,282,'Rubi','Air Canada',NULL,'Male',26,'Captain',5,'Rubi123'),(16,314,'Kirylr','Air Canada',NULL,'Male',27,'Steward/Stewardess',6,'Kirylr123'),(17,12,'Nealon','Air Canada',NULL,'Female',31,'Captain',10,'Nealon123'),(18,677,'Aniyah','Air Canada',NULL,'Female',23,'Pilot',2,'Aniyah123'),(19,53,'Bacheler','Air Canada',NULL,'Female',32,'Steward/Stewardess',12,'Bacheler123'),(20,134,'Tzvi','Air Canada',NULL,'Female',36,'Pilot',15,'Tzvi123'),(21,647,'Ayub','Air Canada',NULL,'Female',28,'Pilot',3,'Ayub123'),(22,428,'Lolo','Air Canada',NULL,'Male',27,'Steward/Stewardess',3,'Lolo123'),(23,37,'Louisa','Air Canada',NULL,'Male',28,'Steward/Stewardess',4,'Louisa123'),(24,366,'Cenon','Air Canada',NULL,'Female',29,'Pilot',4,'Cenon123'),(25,39,'Demi','Cape Air',NULL,'Male',30,'Steward/Stewardess',5,'Demi123'),(26,390,'Siloa','Cape Air',NULL,'Female',24,'Pilot',1,'Siloa123'),(27,38,'Carny','Cape Air',NULL,'Male',25,'Pilot',1,'Carny123'),(28,361,'Whitcomb','Cape Air',NULL,'Male',23,'Steward/Stewardess',1,'Whitcomb123'),(29,57,'Charlton','Cape Air',NULL,'Male',22,'Captain',2,'Charlton'),(30,363,'Atonia','Cape Air',NULL,'Male',27,'Pilot',4,'Atonia123'),(31,279,'Halina','Cape Air',NULL,'Female',28,'Steward/Stewardess',6,'Halina123'),(32,574,'Toft','Cape Air',NULL,'Male',32,'Pilot',6,'Toft123'),(33,853,'Baram','Cape Air',NULL,'Male',34,'Steward/Stewardess',7,'Baram123'),(34,85,'Petros','Cape Air',NULL,'Male',37,'Captain',14,'Petros123'),(35,580,'Hugin','Cape Air',NULL,'Male',35,'Steward/Stewardess',13,'Hugin123'),(36,72,'Fynn','Cape Air',NULL,'Male',37,'Captain',15,'Fynn123');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-11  5:10:57
