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
-- Table structure for table `corsi`
--

DROP TABLE IF EXISTS `corsi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `corsi` (
  `cod_corso` int NOT NULL AUTO_INCREMENT,
  `nome_corso` varchar(100) DEFAULT NULL,
  `crediti` tinyint unsigned DEFAULT NULL,
  `cod_docente` int DEFAULT NULL,
  PRIMARY KEY (`cod_corso`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corsi`
--

LOCK TABLES `corsi` WRITE;
/*!40000 ALTER TABLE `corsi` DISABLE KEYS */;
INSERT INTO `corsi` VALUES (1,'Orientamento propedeutico',NULL,NULL),(2,'Materiale condiviso - Cartella del partecipante',NULL,NULL),(3,'Materiale condiviso - Docenti',NULL,NULL),(4,'Approfondimenti didattici',NULL,NULL),(5,'Autenticazione, Autorizzazione e firme digitali',NULL,NULL),(6,'Base di dati - NoSQL',NULL,NULL),(7,'Base di dati - SQL',NULL,NULL),(8,'AI e Machine Learning - Python',NULL,NULL),(9,'Business Intelligence',NULL,NULL),(10,'Cloud Services e Container',NULL,NULL),(11,'Concetti di Economia e Finanza Decentralizzata',NULL,NULL),(12,'Copyright e norme giuridiche del mondo digitale',NULL,NULL),(13,'Fondamenti AGILE',NULL,NULL),(14,'Fondamenti di basi di dati',NULL,NULL),(15,'Fondamenti di programmazione',NULL,NULL),(16,'Fondamenti di reti di calcolatori',NULL,NULL),(17,'Fondamenti di Version Control',NULL,NULL),(18,'Inglese',NULL,NULL),(19,'Laboratorio di preparazione project work',NULL,NULL),(20,'Learning by Project',NULL,NULL),(21,'Linux Server',NULL,NULL),(22,'Orientamento',NULL,NULL),(23,'Parità fra uomini e donne e non discriminazione',NULL,NULL),(24,'Percorso di svilupo Soft-Skills',NULL,NULL),(25,'Programmazione - Java',NULL,NULL),(26,'Programmazione WEB - HTML | CSS | Javascript',NULL,NULL),(27,'RESTful API',NULL,NULL),(28,'Sicurezza sul lavoro',NULL,NULL),(29,'Tecnologie Blockchain',NULL,NULL),(101,'Matematica',6,201),(102,'Informatica',9,202),(103,'Fisica',6,203),(104,'Chimica',9,204),(105,'Biologia',7,201),(106,'Storia dell\'arte',8,202),(107,'Letteratura',10,203),(108,'Economia',7,204);
/*!40000 ALTER TABLE `corsi` ENABLE KEYS */;
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
