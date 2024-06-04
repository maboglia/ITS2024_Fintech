-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: its_2024
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `studenti`
--

DROP TABLE IF EXISTS `studenti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studenti` (
  `matricola` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `cognome` varchar(45) DEFAULT NULL,
  `data_nascita` date DEFAULT NULL,
  `cod_corso` int DEFAULT NULL,
  PRIMARY KEY (`matricola`)
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studenti`
--

LOCK TABLES `studenti` WRITE;
/*!40000 ALTER TABLE `studenti` DISABLE KEYS */;
INSERT INTO `studenti` VALUES (1,'Alessandro','Revelli',NULL,NULL),(2,'Matteo','Gabrielli',NULL,NULL),(3,'Giorgio','Murino',NULL,NULL),(4,'Luca','Dammacco',NULL,NULL),(5,'Daniele','Panzica',NULL,NULL),(6,'Gianluca','Fiore',NULL,NULL),(7,'Francesco','Pinna',NULL,NULL),(8,'filippo','ughetto',NULL,NULL),(9,'Marco','Massaro',NULL,NULL),(10,'Federico','Colantuono',NULL,NULL),(11,'Davide','Botta',NULL,NULL),(12,'Chiara','Gioda',NULL,NULL),(13,'Bryan','Lume',NULL,NULL),(14,'Andrea','Racca',NULL,NULL),(15,'Stefania','Bordino',NULL,NULL),(16,'mattia','forneron',NULL,NULL),(17,'Lorenzo','Prette',NULL,NULL),(18,'Alessandro','Bruzzese',NULL,NULL),(19,'loris','zanellati',NULL,NULL),(20,'Alessandro','Turco',NULL,NULL),(21,'William','Fernandez',NULL,NULL),(22,'Sara','Durando',NULL,NULL),(23,'Federico','Matacchione',NULL,NULL),(24,'Giulia','Zhou',NULL,NULL),(25,'Giulio','Vacca',NULL,NULL),(26,'Umberto','Riccio',NULL,NULL),(27,'Davide','Andreozzi',NULL,NULL),(28,'Nicola','Aggeri',NULL,NULL),(1001,'Mario','Rossi','2000-01-01',101),(1002,'Luca','Verdi','1999-02-02',102),(1003,'Anna','Bianchi','2000-03-03',101),(1004,'Sara','Neri','1999-04-04',103),(1005,'Giovanni','Gialli','2000-05-05',104),(1006,'Chiara','Rosa','1999-06-06',105),(1007,'Alessandro','Marroni','2000-07-07',102),(1008,'Elisa','Viola','1999-08-08',101);
/*!40000 ALTER TABLE `studenti` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-15 16:32:37
