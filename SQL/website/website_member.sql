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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `member` (
  `member_no` int(11) NOT NULL AUTO_INCREMENT COMMENT '소속번호',
  `member_cafe_name` varchar(45) DEFAULT NULL COMMENT '카페명',
  `member_user_id` varchar(45) DEFAULT NULL COMMENT '아이디',
  `member_grade` varchar(10) DEFAULT NULL COMMENT '등급',
  `member_board_count` int(11) NOT NULL DEFAULT '0' COMMENT '게시물수',
  `member_visit_count` int(11) NOT NULL DEFAULT '0' COMMENT '방문수',
  `member_last_visit` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '마지막방문',
  PRIMARY KEY (`member_no`),
  KEY `member_cafe_name_idx` (`member_cafe_name`),
  KEY `member_user_id_idx` (`member_user_id`),
  CONSTRAINT `member_cafe_name` FOREIGN KEY (`member_cafe_name`) REFERENCES `cafe` (`cafe_name`),
  CONSTRAINT `member_user_id` FOREIGN KEY (`member_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='소속';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'고양이 ','aaa111','일반회원',1,0,'2019-04-30 14:20:49'),(2,'고양이','bbb111','일반회원',2,0,'2019-04-30 14:20:49'),(3,'고양이','ccc111','우수회원',1,0,'2019-04-30 14:20:49'),(4,'갤럭시','ccc111','일반회원',2,0,'2019-04-30 14:20:49'),(5,'갤럭시','bbb111','일반회원',1,0,'2019-04-30 14:20:49'),(8,'갤럭시 ','eee111','일반회원',1,0,'2019-04-30 14:20:49'),(9,'강아지','eee111','일반회원',1,0,'2019-04-30 14:20:49'),(10,'강아지','aaa111','일반회원',2,0,'2019-04-30 14:20:49'),(11,'강아지','ddd111','일반회원',1,0,'2019-04-30 14:20:49');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-30 16:40:51
