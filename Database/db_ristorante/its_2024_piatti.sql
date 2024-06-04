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
-- Table structure for table `piatti`
--

DROP TABLE IF EXISTS `piatti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `piatti` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `prezzo` decimal(5,2) DEFAULT NULL,
  `tipo_piatto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tipo_piatto_id` (`tipo_piatto_id`),
  CONSTRAINT `piatti_ibfk_1` FOREIGN KEY (`tipo_piatto_id`) REFERENCES `tipi_piatto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `piatti`
--

LOCK TABLES `piatti` WRITE;
/*!40000 ALTER TABLE `piatti` DISABLE KEYS */;
INSERT INTO `piatti` VALUES (1,'Ravioli al ragù',5.00,1),(2,'Torta pasqualina',6.00,2),(3,'Torta di pinoli',3.00,3),(4,'Birra',1.50,4),(5,'Trenette al pesto',4.00,1),(6,'Stoccafisso alla Genovese',5.00,2),(7,'Torta di mele',2.50,3),(8,'Vino rosso',2.00,4),(9,'Minestrone',3.50,1),(10,'Polpo in aglio e prezzemolo',4.50,2),(11,'Tiramisù',3.00,3),(12,'Acqua',1.00,4),(13,'Pansotti in salsa di noci',5.50,1),(14,'Cima',4.50,2),(15,'Torta di rose',2.50,3),(16,'Vino bianco',2.00,4);
/*!40000 ALTER TABLE `piatti` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-09 10:50:33
