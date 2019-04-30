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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `board` (
  `board_no` int(11) NOT NULL AUTO_INCREMENT COMMENT '게시글번호',
  `board_title` varchar(255) NOT NULL COMMENT '제목',
  `board_content` longtext COMMENT '내용',
  `board_writer` varchar(45) NOT NULL COMMENT '작성자',
  `board_category_code` varchar(6) DEFAULT NULL COMMENT '분류',
  `board_registered_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '작성일',
  `board_cafe_name` varchar(45) NOT NULL COMMENT '카페명',
  PRIMARY KEY (`board_no`),
  KEY `board_category_code_idx` (`board_category_code`),
  KEY `boaed_cafe_name_idx` (`board_cafe_name`),
  CONSTRAINT `boaed_cafe_name` FOREIGN KEY (`board_cafe_name`) REFERENCES `cafe` (`cafe_name`),
  CONSTRAINT `board_category_code` FOREIGN KEY (`board_category_code`) REFERENCES `category` (`category_code`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COMMENT='게시글';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (40,'강아지사진','123','aaa111','1','2019-04-30 14:47:55','강아지'),(41,'강아지사진2','123','aaa111','1','2019-04-30 14:52:46','강아지'),(42,'강아지사진3','123','ddd111','1','2019-04-30 14:53:26','강아지'),(43,'강아지사료','123','eee111','1','2019-04-30 14:53:26','강아지'),(44,'갤럭시s10','123','bbb111','1','2019-04-30 14:54:12','갤럭시'),(45,'갤럭시s9','123','eee111','1','2019-04-30 14:54:12','갤럭시'),(46,'고양이정보1','123','bbb111','1','2019-04-30 14:55:36','고양이'),(47,'고양이정보2','123','bbb111','1','2019-04-30 14:55:36','고양이'),(48,'고양이정보3','123','ccc111','1','2019-04-30 14:55:36','고양이'),(49,'고양이정보4','123','aaa111','1','2019-04-30 14:55:36','고양이'),(50,'갤럭시s8','123','ccc111','1','2019-04-30 14:56:26','갤럭시'),(51,'갤럭시노트10','123','ccc111','1','2019-04-30 14:56:26','갤럭시');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
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
