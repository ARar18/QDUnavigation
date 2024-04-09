-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: navi
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
-- Table structure for table `edge`
--

DROP TABLE IF EXISTS `edge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `edge` (
  `edge_no` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `src_node` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `tar_node` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `length` int DEFAULT NULL,
  PRIMARY KEY (`edge_no`),
  KEY `src_node` (`src_node`),
  KEY `tar_node` (`tar_node`),
  CONSTRAINT `edge_ibfk_1` FOREIGN KEY (`src_node`) REFERENCES `node` (`node_no`),
  CONSTRAINT `edge_ibfk_2` FOREIGN KEY (`tar_node`) REFERENCES `node` (`node_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `edge`
--

LOCK TABLES `edge` WRITE;
/*!40000 ALTER TABLE `edge` DISABLE KEYS */;
INSERT INTO `edge` VALUES ('1','1','2',68),('10','211','212',10),('11','212','14',53),('12','210','9',45),('13','9','7',24),('14','7','11',34),('15','9','10',11),('16','10','13',46),('17','11','16',42),('18','13','14',11),('19','16','18',33),('2','1','4',66),('20','14','18',22),('21','8','18',75),('22','8','181',18),('23','181','180',20),('24','180','15',37),('25','15','12',40),('26','5','12',88),('27','12','176',27),('28','176','26',58),('29','26','29',17),('3','2','3',7),('30','15','177',37),('31','177','178',20),('32','178','179',18),('33','179','20',11),('34','20','19',17),('35','19','18',13),('36','7','17',75),('37','17','21',52),('38','21','22',36),('39','27','31',29),('4','3','4',6),('40','18','24',55),('41','19','27',61),('42','27','28',15),('43','28','214',20),('44','214','215',25),('45','215','40',20),('46','31','204',20),('47','204','40',39),('48','40','38',50),('49','38','39',13),('5','3','6',22),('50','39','37',9),('51','39','30',56),('52','37','31',48),('53','30','31',12),('54','30','213',40),('55','213','214',31),('56','22','24',12),('57','22','31',35),('58','24','27',20),('59','20','25',27),('6','4','8',40),('60','25','31',39),('61','25','36',112),('62','36','201',22),('63','36','202',21),('64','36','29',46),('65','26','183',42),('66','183','182',34),('67','182','33',18),('68','33','34',32),('69','29','34',56),('7','6','209',18),('70','33','35',14),('71','35','41',30),('72','34','41',39),('73','35','184',38),('74','184','185',15),('75','185','186',17),('76','186','45',37),('77','41','45',49),('78','45','46',24),('79','36','46',108),('8','209','210',13),('80','46','50',19),('81','50','49',71),('82','202','44',34),('83','44','49',31),('9','6','211',15);
/*!40000 ALTER TABLE `edge` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-09 21:29:45
