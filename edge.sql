-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: navi
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
INSERT INTO `edge` VALUES ('1','1','2',68),('10','211','212',10),('100','205','206',106),('101','206','207',19),('102','207','94',11),('103','94','208',16),('104','94','87',53),('105','87','88',10),('106','87','101',30),('107','101','103',13),('108','80','102',49),('109','102','132',80),('11','212','14',53),('110','39','43',37),('111','40','43',42),('112','40','32',76),('113','43','48',32),('114','43','47',34),('115','47','48',36),('116','47','51',31),('117','51','52',72),('118','51','109',65),('119','51','72',70),('12','210','9',45),('120','51','60',51),('121','72','60',44),('122','52','62',43),('123','62','73',30),('124','72','73',67),('125','71','72',30),('126','71','70',36),('127','70','59',31),('128','49','59',39),('129','70','66',71),('13','9','7',24),('130','50','66',65),('131','66','61',74),('132','52','53',68),('133','73','74',53),('134','73','100',69),('135','66','77',33),('136','77','76',72),('137','61','76',38),('138','77','82',8),('139','82','93',30),('14','7','11',34),('140','76','92',36),('141','92','93',73),('142','92','91',71),('143','84','91',14),('144','91','107',42),('145','107','114',30),('146','92','112',45),('147','112','118',24),('148','114','118',69),('149','114','134',41),('15','9','10',11),('150','134','145',32),('151','118','148',70),('152','148','147',33),('153','147','145',33),('154','145','146',83),('155','146','149',98),('156','146','187',70),('157','187','188',20),('158','188','169',22),('159','169','170',36),('16','10','13',46),('160','169','189',28),('161','189','172',29),('162','145','190',13),('163','190','163',49),('164','163','191',84),('165','191','173',10),('166','70','78',34),('167','78','95',38),('168','78','79',22),('169','71','75',18),('17','11','16',42),('170','75','79',16),('171','75','81',21),('172','81','85',19),('173','79','85',20),('174','85','96',20),('175','81','83',13),('176','72','83',30),('177','83','86',10),('178','86','97',24),('179','97','96',30),('18','13','14',11),('180','96','95',35),('181','93','95',68),('182','98','100',54),('183','100','103',9),('184','93','105',34),('185','105','119',37),('186','105','106',21),('187','106','110',28),('188','110','111',28),('189','95','111',44),('19','16','18',33),('190','111','113',1),('191','113','123',25),('192','110','121',27),('193','123','121',34),('194','121','122',6),('195','122','119',31),('196','97','124',65),('197','124','133',28),('198','133','139',17),('199','133','219',26),('2','1','4',66),('20','14','18',22),('200','219','123',34),('201','123','124',64),('202','127','128',21),('203','128','139',26),('204','124','128',14),('205','133','139',17),('206','139','155',66),('207','80','99',65),('208','99','102',51),('209','99','104',17),('21','8','18',75),('210','99','103',15),('211','104','216',53),('212','216','109',30),('213','104','116',35),('214','103','127',85),('215','127','218',20),('216','218','217',54),('217','217','115',26),('218','94','101',57),('219','123','137',33),('22','8','181',18),('220','137','155',45),('221','137','138',23),('222','122','129',17),('223','136','135',20),('224','141','153',20),('225','129','138',20),('226','129','136',20),('227','136','141',20),('228','138','141',20),('229','121','137',50),('23','181','180',20),('230','122','135',50),('231','135','153',50),('232','153','137',50),('233','153','154',21),('234','154','155',23),('235','155','159',17),('236','155','161',42),('237','161','154',41),('238','153','152',32),('239','119','135',36),('24','180','15',37),('240','135','200',20),('241','200','152',12),('242','143','200',13),('243','143','144',16),('244','144','151',19),('245','144','142',10),('246','142','150',10),('247','142','140',6),('248','140','148',24),('249','140','118',50),('25','15','12',40),('250','140','131',24),('251','143','130',23),('252','130','131',22),('253','125','126',9),('254','120','125',12),('255','120','117',13),('256','117','118',18),('257','120','119',36),('258','151','150',13),('259','150','148',23),('26','5','12',88),('260','151','157',24),('261','151','152',33),('262','157','165',38),('263','157','195',26),('264','195','167',27),('265','167','165',23),('266','167','168',10),('267','165','166',36),('268','147','158',31),('269','158','160',22),('27','12','176',27),('270','158','162',27),('271','162','164',15),('272','162','166',32),('273','166','192',15),('274','192','193',10),('275','193','194',18),('276','194','171',21),('277','152','196',10),('278','196','156',23),('279','153','156',9),('28','176','26',58),('280','156','197',18),('281','197','168',40),('282','168','199',14),('283','199','198',7),('284','198','161',42),('285','130','125',16),('286','126','131',13),('287','117','126',16),('288','28','214',21),('29','26','29',17),('3','2','3',7),('30','15','177',37),('31','177','178',20),('32','178','179',18),('33','179','20',11),('34','20','19',17),('35','19','18',13),('36','7','17',75),('37','17','21',52),('38','21','22',36),('39','27','32',29),('4','3','4',6),('40','18','24',55),('41','19','27',61),('42','27','28',15),('43','28','214',20),('44','214','215',25),('45','215','40',20),('46','32','204',20),('47','204','40',39),('48','40','38',50),('49','38','39',13),('5','3','6',22),('50','39','37',9),('51','39','30',56),('52','37','31',48),('53','30','31',12),('54','30','213',40),('55','213','28',28),('56','22','24',12),('57','22','32',35),('58','24','27',20),('59','20','25',27),('6','4','8',40),('60','25','31',39),('61','25','36',112),('62','36','201',22),('63','36','202',21),('64','36','29',46),('65','26','183',42),('66','183','182',34),('67','182','33',18),('68','33','34',32),('69','29','34',56),('7','6','209',18),('70','33','35',14),('71','35','41',30),('72','34','41',39),('73','35','184',38),('74','184','185',15),('75','185','186',17),('76','186','45',37),('77','41','45',49),('78','45','46',24),('79','36','46',108),('8','209','210',13),('80','46','50',19),('81','50','49',71),('82','202','44',34),('83','44','49',31),('84','201','37',56),('85','174','175',72),('86','174','61',75),('87','175','67',82),('88','61','65',19),('89','65','67',54),('9','6','211',15),('90','67','68',40),('91','65','84',77),('92','67','84',49),('93','61','46',93),('94','84','89',186),('95','84','90',186),('96','32','42',73),('97','42','53',70),('98','53','80',91),('99','53','205',46);
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

-- Dump completed on 2024-04-14 12:20:19