CREATE DATABASE  IF NOT EXISTS `hillellearn` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hillellearn`;
-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hillellearn
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `cathedra`
--

DROP TABLE IF EXISTS `cathedra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cathedra` (
  `id_cathedra` int NOT NULL AUTO_INCREMENT,
  `cathedra_name` text,
  `chief` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cathedra`),
  UNIQUE KEY `id_cathedra` (`id_cathedra`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cathedra`
--

LOCK TABLES `cathedra` WRITE;
/*!40000 ALTER TABLE `cathedra` DISABLE KEYS */;
INSERT INTO `cathedra` VALUES (1,'migration','Iolanthe Spurier'),(2,'Exclusive','Pierette Loder'),(3,'intangible','Faulkner Stut'),(4,'high-level','Muriel Lenaghen'),(5,'Organized','Humfrey Lingard');
/*!40000 ALTER TABLE `cathedra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupa`
--

DROP TABLE IF EXISTS `grupa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupa` (
  `id_group` int NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_group`),
  UNIQUE KEY `id_group` (`id_group`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupa`
--

LOCK TABLES `grupa` WRITE;
/*!40000 ALTER TABLE `grupa` DISABLE KEYS */;
INSERT INTO `grupa` VALUES (1,'U-max Wrinkle Serum'),(2,'Melissa Cold Sore Relief'),(3,'Levothyroxine Sodium'),(4,'Diclofenac Sodium'),(5,'Oxacillin'),(6,'Methylphenidate Hydrochloride'),(7,'Natural Acne Solutions Clarifying Toner'),(8,'Sisal'),(9,'Valproic Acid'),(10,'Conjunct-a-Clear'),(11,'verapamil hydrochloride'),(12,'Indomethacin'),(13,'Nefazodone Hydrochloride'),(14,'nasal'),(15,'Isosorbide mononitrate'),(16,'Live Better'),(17,'Stomach Relief'),(18,'REPREXAIN'),(19,'Hydroxyzine Hydrochloride'),(20,'leader ibuprofen cold and sinus');
/*!40000 ALTER TABLE `grupa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lessons`
--

DROP TABLE IF EXISTS `lessons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lessons` (
  `id_lesson` int NOT NULL AUTO_INCREMENT,
  `lesson_name` varchar(255) DEFAULT NULL,
  `id_teacher` int DEFAULT NULL,
  `semester` int DEFAULT NULL,
  `study_year` int DEFAULT NULL,
  PRIMARY KEY (`id_lesson`),
  UNIQUE KEY `id_lesson` (`id_lesson`),
  KEY `id_teacher` (`id_teacher`),
  CONSTRAINT `lessons_ibfk_1` FOREIGN KEY (`id_teacher`) REFERENCES `teachers` (`id_teacher`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lessons`
--

LOCK TABLES `lessons` WRITE;
/*!40000 ALTER TABLE `lessons` DISABLE KEYS */;
INSERT INTO `lessons` VALUES (1,'Madeline Heberden',13,1,5),(2,'Katalin Minto',11,2,1),(3,'Ally Blenkiron',1,2,5),(4,'Ebeneser Jeffcoat',15,1,4),(5,'Christian Stave',15,2,5),(6,'Tiphany Durdle',20,1,5),(7,'Barbabas Bestwerthick',18,1,2),(8,'Grantley Tarrier',10,1,3),(9,'Portie Aspland',18,2,3),(10,'Othella Glavis',19,2,4),(11,'Myrle Bollin',16,2,5),(12,'Kimmy O\'Harney',2,2,5),(13,'Mel Horney',15,1,4),(14,'Darb Hearmon',1,1,3),(15,'Hendrik Cogzell',19,1,5),(16,'Cody Durnill',14,1,1),(17,'Morie Stansby',19,1,4),(18,'William Josipovitz',15,2,5),(19,'Pebrook Ring',9,1,5),(20,'Andie Standingford',17,2,2),(21,'Marjorie Demangeot',16,1,1),(22,'Alva Turfin',22,2,1),(23,'Josey McAviy',13,1,5),(24,'Ulrica Litherborough',22,1,3),(25,'Delaney Isgate',19,1,1),(26,'Gregorius Dallinder',10,2,1),(27,'Ellsworth Elliston',9,2,4),(28,'Cassi Marunchak',20,1,2),(29,'Zane Keelan',19,1,1),(30,'Eartha Artinstall',6,2,2),(31,'Sheree Loynes',17,2,3),(32,'Marve Korneluk',13,1,5),(33,'Iorgo Rijkeseis',19,2,4),(34,'Englebert Swadden',5,2,4),(35,'De Joderli',3,2,5),(36,'Carolyn Stillmann',9,1,1),(37,'Berty Piet',17,2,2),(38,'Erick Tweedell',11,1,5),(39,'Derry Marques',6,1,5),(40,'Robinet Ends',4,2,4),(41,'Bobbie Cunningham',5,1,4),(42,'Preston Scutchings',9,1,2),(43,'Gasper Duckerin',10,1,1),(44,'Winonah Denne',20,2,5),(45,'Carl Wadeson',12,1,2),(46,'Dallas Heineken',9,2,4),(47,'Caren Annies',17,2,1),(48,'Claude Stammirs',15,2,5),(49,'Amberly MacCracken',1,2,3),(50,'Angie Kenworthey',19,1,5);
/*!40000 ALTER TABLE `lessons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scores`
--

DROP TABLE IF EXISTS `scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scores` (
  `id_score` int NOT NULL AUTO_INCREMENT,
  `id_lesson` int DEFAULT NULL,
  `id_student` int DEFAULT NULL,
  `score` double DEFAULT NULL,
  PRIMARY KEY (`id_score`),
  UNIQUE KEY `id_score` (`id_score`),
  KEY `id_lesson` (`id_lesson`),
  KEY `id_student` (`id_student`),
  CONSTRAINT `scores_ibfk_1` FOREIGN KEY (`id_lesson`) REFERENCES `lessons` (`id_lesson`),
  CONSTRAINT `scores_ibfk_2` FOREIGN KEY (`id_student`) REFERENCES `students` (`id_student`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scores`
--

LOCK TABLES `scores` WRITE;
/*!40000 ALTER TABLE `scores` DISABLE KEYS */;
INSERT INTO `scores` VALUES (1,29,73,54),(2,7,35,47),(3,33,60,40),(4,24,94,63),(5,2,80,39),(6,9,44,51),(7,5,27,48),(8,50,6,51),(9,28,41,44),(10,15,8,87),(11,19,29,100),(12,29,69,57),(13,37,16,26),(14,47,56,49),(15,33,13,54),(16,22,95,89),(17,4,45,98),(18,23,92,82),(19,34,12,78),(20,5,90,58),(21,9,100,51),(22,35,19,37),(23,32,7,74),(24,18,46,72),(25,44,5,62),(26,5,76,61),(27,28,99,16),(28,42,72,86),(29,29,44,44),(30,7,36,53),(31,22,55,27),(32,4,89,12),(33,29,84,58),(34,28,3,15),(35,18,67,38),(36,37,29,25),(37,38,28,82),(38,10,92,30),(39,34,27,41),(40,15,85,75),(41,9,7,35),(42,22,92,60),(43,22,26,47),(44,9,9,60),(45,2,76,69),(46,28,25,27),(47,47,67,40),(48,33,67,77),(49,34,97,32),(50,6,87,68),(51,9,51,49),(52,21,65,58),(53,6,56,21),(54,22,21,41),(55,7,16,28),(56,4,47,27),(57,16,94,50),(58,12,54,49),(59,31,11,30),(60,26,47,78),(61,35,56,10),(62,39,99,96),(63,17,25,34),(64,36,79,38),(65,35,67,66),(66,46,24,40),(67,19,70,57),(68,42,77,12),(69,34,63,99),(70,48,71,29),(71,6,55,25),(72,42,2,75),(73,15,15,76),(74,8,33,79),(75,2,84,23),(76,6,45,50),(77,35,97,87),(78,45,12,10),(79,22,29,30),(80,14,45,85),(81,9,91,70),(82,17,18,49),(83,33,89,17),(84,11,26,37),(85,40,65,60),(86,46,99,96),(87,27,92,63),(88,23,78,28),(89,47,27,66),(90,14,97,92),(91,4,28,47),(92,27,52,93),(93,9,64,15),(94,42,45,83),(95,12,52,79),(96,5,27,23),(97,29,38,71),(98,24,63,20),(99,22,52,79),(100,39,81,50);
/*!40000 ALTER TABLE `scores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id_student` int NOT NULL AUTO_INCREMENT,
  `fio` text,
  `id_group` int DEFAULT NULL,
  `admission_year` datetime DEFAULT NULL,
  PRIMARY KEY (`id_student`),
  UNIQUE KEY `id_student` (`id_student`),
  KEY `id_group` (`id_group`),
  CONSTRAINT `students_ibfk_1` FOREIGN KEY (`id_group`) REFERENCES `grupa` (`id_group`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Virgie Jovic',5,'2016-02-28 11:35:04'),(2,'Nester Skelhorne',20,'2020-02-17 13:27:26'),(3,'Kennett Grassick',1,'2017-01-11 01:38:41'),(4,'Darcy Dimelow',11,'2019-12-23 03:36:19'),(5,'Yardley Moyes',20,'2019-09-29 15:42:25'),(6,'Kellina Durston',10,'2020-02-21 01:02:58'),(7,'Roxana Castellet',19,'2017-09-25 14:42:52'),(8,'Giulia Heams',20,'2017-03-08 12:06:02'),(9,'Bernardina Bernade',6,'2017-03-31 11:36:00'),(10,'Alia Boughen',14,'2015-10-14 20:05:10'),(11,'Melita Counihan',2,'2020-03-17 23:28:18'),(12,'Prince Scad',12,'2015-10-12 04:17:11'),(13,'Trever Beartup',10,'2016-06-06 19:12:48'),(14,'Astra Lovick',10,'2017-11-04 06:44:04'),(15,'Emmey Shall',20,'2016-05-19 15:45:32'),(16,'Ethelred Carlill',11,'2017-09-25 08:20:30'),(17,'Jenica Ions',10,'2019-07-08 20:34:32'),(18,'Gwyn Pala',10,'2016-05-24 08:19:47'),(19,'Minnie Kirrens',5,'2016-10-11 18:10:43'),(20,'Bartie Edworthye',5,'2017-07-12 15:04:04'),(21,'Renee Standfield',19,'2019-05-17 19:26:30'),(22,'Olin Jurasz',13,'2019-10-04 18:30:18'),(23,'Amberly Parnaby',11,'2016-10-09 12:34:32'),(24,'Haywood Besson',15,'2015-12-18 01:21:36'),(25,'Kellen Ireland',8,'2019-07-08 14:57:25'),(26,'Ardeen Brankley',11,'2017-10-28 04:34:52'),(27,'Peg Asken',5,'2017-07-04 12:44:00'),(28,'Eddi Tuff',19,'2016-12-11 08:45:18'),(29,'Morey Pavinese',19,'2015-11-22 02:02:03'),(30,'Bari Seathwright',2,'2017-09-11 02:51:41'),(31,'Ben Winwright',14,'2016-06-19 16:31:29'),(32,'Pall Chattey',16,'2017-11-18 23:49:52'),(33,'Chryste Chestney',6,'2017-08-30 04:45:52'),(34,'Sela Polfer',5,'2020-06-02 07:44:25'),(35,'Hew Guisby',8,'2016-04-25 02:25:29'),(36,'Tedda Kopta',13,'2016-06-05 15:05:42'),(37,'Witty Korting',11,'2018-09-24 11:43:52'),(38,'Junia Stormonth',15,'2018-08-30 16:56:27'),(39,'Odelle Breward',18,'2016-01-03 19:58:02'),(40,'Devora Molyneaux',9,'2019-10-03 20:24:13'),(41,'Salmon Abbyss',14,'2017-07-23 15:33:27'),(42,'Harrietta Chaise',4,'2020-04-26 23:08:50'),(43,'Jennie Horney',6,'2017-12-19 13:09:21'),(44,'Maurie Cockton',11,'2018-02-10 10:08:44'),(45,'Leonore Ivkovic',6,'2018-06-22 22:28:59'),(46,'Wolfgang Frensch',14,'2017-10-06 00:07:26'),(47,'Melamie Goodram',12,'2016-05-05 15:04:15'),(48,'Noah Shawl',12,'2016-03-31 06:05:10'),(49,'Berget Djokovic',13,'2017-06-01 17:15:36'),(50,'Shena Wogan',19,'2016-05-10 19:55:30'),(51,'Ferrell Cicchinelli',2,'2019-10-21 20:08:36'),(52,'Matthus Scud',13,'2018-08-25 04:48:04'),(53,'Berrie Casazza',6,'2015-09-06 09:44:51'),(54,'Melesa Wingeatt',5,'2020-03-01 13:21:48'),(55,'Culley Grim',20,'2019-07-19 15:55:45'),(56,'Der De la croix',20,'2020-02-22 14:41:56'),(57,'Vassily Palmar',11,'2017-03-24 07:36:29'),(58,'Elvyn Jeacocke',3,'2016-05-16 23:49:46'),(59,'Ivett Tibbotts',6,'2019-04-21 16:22:51'),(60,'Nicky Hillock',3,'2016-01-11 17:00:18'),(61,'Allyn Lamming',1,'2017-05-09 15:44:57'),(62,'Donnell Alam',12,'2019-09-21 14:57:10'),(63,'Huey Winder',19,'2018-07-20 00:09:13'),(64,'Morty Winkett',1,'2016-05-20 14:59:41'),(65,'Lydia Autin',7,'2019-12-22 08:40:24'),(66,'Carlynn MacTrusty',3,'2017-06-03 11:25:28'),(67,'Dante Hollebon',10,'2018-11-26 21:17:16'),(68,'Christoforo Chaperling',14,'2019-08-10 11:54:15'),(69,'Bard Springle',17,'2020-07-05 18:29:12'),(70,'Quinta Emanuele',15,'2017-09-24 10:09:03'),(71,'Viole Klosterman',9,'2019-05-11 18:08:02'),(72,'Flint Cogar',6,'2017-01-06 00:23:39'),(73,'Fredia Eble',17,'2017-12-25 02:30:08'),(74,'Paxon Ruffles',8,'2019-07-01 22:02:40'),(75,'Cindie Comber',14,'2017-03-13 01:48:46'),(76,'Aurel Morcomb',13,'2016-03-25 23:25:22'),(77,'Pearle Alldre',10,'2016-07-12 16:43:46'),(78,'Orland Carbett',7,'2020-05-19 21:57:37'),(79,'Rickard Wilbor',17,'2016-04-03 18:42:18'),(80,'Foster Gormally',19,'2018-01-14 23:39:20'),(81,'Enrika Ferras',20,'2018-11-06 12:47:58'),(82,'Gilbertine Roddam',20,'2017-09-02 09:22:48'),(83,'Fernandina Mariolle',11,'2019-01-23 17:11:56'),(84,'Sherlock Bibbie',10,'2016-04-01 14:00:43'),(85,'Naomi Cunde',1,'2020-01-07 23:19:35'),(86,'Lamond Brenard',11,'2019-04-26 02:16:53'),(87,'Oralee Rushworth',2,'2017-01-31 20:58:41'),(88,'Burnard Sharkey',12,'2017-04-18 01:41:20'),(89,'Keir Anders',12,'2018-08-13 06:15:45'),(90,'Dehlia McIlwrick',8,'2017-10-26 09:12:37'),(91,'Lita Blewis',3,'2018-10-30 05:07:06'),(92,'Marla Havvock',3,'2020-07-31 08:07:43'),(93,'Oliver Silbermann',2,'2020-01-22 21:06:21'),(94,'King Wloch',17,'2019-09-03 14:57:38'),(95,'Sosanna Sole',12,'2015-12-20 15:07:44'),(96,'Gerry Hancox',2,'2015-11-17 11:11:17'),(97,'Lauree Leele',17,'2015-11-22 20:44:26'),(98,'Locke Lawlan',8,'2019-07-15 20:41:47'),(99,'Solly Fidian',16,'2018-12-03 15:29:04'),(100,'Theo Anthes',18,'2017-10-05 11:57:52');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachers` (
  `id_teacher` int NOT NULL AUTO_INCREMENT,
  `FIO` varchar(255) DEFAULT NULL,
  `id_cathedra` int DEFAULT NULL,
  PRIMARY KEY (`id_teacher`),
  UNIQUE KEY `id_teacher` (`id_teacher`),
  KEY `id_cathedra` (`id_cathedra`),
  CONSTRAINT `teachers_ibfk_1` FOREIGN KEY (`id_cathedra`) REFERENCES `cathedra` (`id_cathedra`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES (1,'Fonz Wollen',4),(2,'Lolly Cawt',2),(3,'Jeannine Sokell',1),(4,'Ardisj Crossan',4),(5,'Gertrud Knight',2),(6,'Joann Syalvester',4),(7,'Kakalina Harnott',3),(8,'Eulalie Pasmore',3),(9,'Anna-diane Perillo',1),(10,'Aarika Armatage',2),(11,'Elicia Dykins',1),(12,'Monique Zorener',2),(13,'Abba Finnie',3),(14,'Emalia Benne',2),(15,'Fern Scutcheon',1),(16,'Tod Grimwood',3),(17,'Igor Bumby',4),(18,'Carr Kitchen',4),(19,'Padriac Pomfrett',2),(20,'Tiertza Shreenan',4),(21,'Tibold Brennenstuhl',1),(22,'Doralin Duthy',5),(23,'Guglielmo Balcombe',1),(24,'Jock Wayte',3),(25,'Fernando Goodfield',4);
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-10 23:56:16
