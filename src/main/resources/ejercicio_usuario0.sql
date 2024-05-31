-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ejercicio
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `login` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cliente` float NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `fechaalta` date NOT NULL DEFAULT current_timestamp(),
  `fechabaja` date DEFAULT NULL,
  `status` char(1) NOT NULL DEFAULT 'A',
  `intentos` float NOT NULL DEFAULT 0,
  `fecharevocado` date DEFAULT NULL,
  `fecha_vigencia` date DEFAULT NULL,
  `no_acceso` int(11) DEFAULT NULL,
  `apellido_paterno` varchar(50) DEFAULT NULL,
  `apellido_materno` varchar(50) DEFAULT NULL,
  `area` int(11) DEFAULT NULL,
  `fechamodificacion` date NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('123','MTIz','123',123,'JORGENIETOM83@gmail.com','2024-05-27','2024-05-27','A',0,'2024-05-27',NULL,NULL,NULL,NULL,123,'2024-05-27'),('2','Mg==','2',2,'','2024-05-26',NULL,'',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-26'),('3','YQ==','3',0,'','2024-05-26',NULL,'',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-26'),('4','NA==','4',4,'','2024-05-26',NULL,'',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-26'),('5','NQ==','5',5,'','2024-05-26',NULL,'',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-26'),('6','Ng==','6',6,'','2024-05-29',NULL,'A',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-26'),('7','Nw==','7',7,'','2024-05-26',NULL,'',0,NULL,'2024-05-24',NULL,'','',NULL,'2024-05-26'),('777','Nzc3','777',777,'','2024-05-26',NULL,'',0,NULL,'2024-05-26',NULL,'','',NULL,'2024-05-26'),('a','YQ==','a',111,'','2024-05-26',NULL,'',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-26'),('admin','YWRtaW4=','jorge',111,'','2024-05-26',NULL,'',0,NULL,'2024-05-26',NULL,'','',NULL,'2024-05-26'),('jadriana','akFkcmlhbmEx','adriana',444,'','2024-05-26',NULL,'',0,NULL,'2024-05-26',NULL,'','',NULL,'2024-05-26'),('jBrenda','akJyZW5kYTE=','Brenda Castellanos',1234,NULL,'2024-05-23',NULL,'A',0,NULL,'2024-05-26',NULL,NULL,NULL,NULL,'2024-05-23'),('jJesica','jJesica1889898','Jesica Monreal',1234,NULL,'2024-05-23',NULL,'A',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-23'),('jLopez','jLopez1','Juan Lopez',1234,NULL,'2024-05-24',NULL,'A',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-24'),('jMariel','jMariel1','Mariel Barragan',1234,NULL,'2024-05-23',NULL,'A',0,NULL,NULL,NULL,NULL,NULL,NULL,'2024-05-23'),('jmonica','ak1vbmljYTE=','monica',777,'','2024-05-26',NULL,'',0,NULL,'2024-05-24',NULL,'','',NULL,'2024-05-26'),('jNieto','am9yZ2U=','',1234,'jorge@gmail.com','2024-05-26',NULL,'A',0,'2024-05-27',NULL,NULL,NULL,NULL,555,'2024-05-28');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-27 10:48:32
