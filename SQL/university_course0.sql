-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: university
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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `course_num` int(11) NOT NULL COMMENT '수강번호',
  `course_student_num` int(11) DEFAULT NULL COMMENT '학번',
  `course_class_num` int(11) DEFAULT NULL COMMENT '강의번호',
  `course_mid` double DEFAULT NULL COMMENT '중간성적',
  `course_end` double DEFAULT NULL COMMENT '기말성적',
  `course_attendance` int(11) DEFAULT NULL COMMENT '출석점수',
  `course_report` int(11) DEFAULT NULL COMMENT '과제',
  `course_total` int(11) DEFAULT NULL COMMENT '총점',
  `course_rating` int(11) DEFAULT NULL COMMENT '등급',
  PRIMARY KEY (`course_num`),
  KEY `course_student_num_idx` (`course_student_num`),
  KEY `course_class_num_idx` (`course_class_num`),
  CONSTRAINT `course_class_num` FOREIGN KEY (`course_class_num`) REFERENCES `class` (`class_num`),
  CONSTRAINT `course_student_num` FOREIGN KEY (`course_student_num`) REFERENCES `student` (`student_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='수강';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,2019100100,1,100,100,100,100,100,NULL),(2,2019100100,2,100,80,100,80,90,NULL),(3,2019100200,1,NULL,NULL,NULL,NULL,NULL,NULL),(4,2019100300,4,NULL,NULL,NULL,NULL,NULL,NULL),(5,2019100400,3,NULL,NULL,NULL,NULL,NULL,NULL),(6,2019100400,4,NULL,NULL,NULL,NULL,NULL,NULL),(7,2019100100,5,100,100,80,100,98,NULL),(8,2019100200,2,NULL,NULL,NULL,NULL,NULL,NULL),(9,2019100500,2,NULL,NULL,NULL,NULL,NULL,NULL),(10,2019100500,5,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-29 13:29:16
