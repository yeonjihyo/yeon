CREATE DATABASE  IF NOT EXISTS `website` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `website`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: website
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `upload`
--

DROP TABLE IF EXISTS `upload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `upload` (
  `upload_no` int(11) NOT NULL AUTO_INCREMENT,
  `upload_filename` varchar(45) NOT NULL,
  `upload_filepath` varchar(45) NOT NULL,
  `upload_board_no` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`upload_no`),
  KEY `upload_board_no_idx` (`upload_board_no`),
  CONSTRAINT `upload_board_no` FOREIGN KEY (`upload_board_no`) REFERENCES `board` (`board_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='첨부파일';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `upload`
--

LOCK TABLES `upload` WRITE;
/*!40000 ALTER TABLE `upload` DISABLE KEYS */;
INSERT INTO `upload` VALUES (1,'사진1','c:/사용자/강아지사진',40),(2,'사진2','c:/사용자/강아지사진',40),(3,'사진3','c:/사용자/강아지사진',41),(4,'사진4','c:/사용자/강아지사진',42),(5,'사료사진','c:/사용자/강아지사료정보',43),(6,'갤럭시s10사진','바탕화면/갤럭시/갤럭시s10',44),(7,'갤럭시s9사진','바탕화면/갤럭시/갤럭시s9',45),(8,'갤럭시s9사진2','바탕화면/갤럭시/갤럭시s9',45),(9,'고양이정보4','내pc/c:/고양이/고양이정보',49);
/*!40000 ALTER TABLE `upload` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-30 16:40:52
