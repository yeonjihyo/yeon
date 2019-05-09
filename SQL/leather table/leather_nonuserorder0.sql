CREATE DATABASE  IF NOT EXISTS `leather` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `leather`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: leather
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
-- Table structure for table `nonuserorder`
--

DROP TABLE IF EXISTS `nonuserorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nonuserorder` (
  `nonuserorder_num` varchar(45) NOT NULL COMMENT '비회원주문번호',
  `nonuserorder_deliver_no` int(11) NOT NULL,
  `nonuserorder_state` varchar(10) DEFAULT NULL,
  `nonuserorder_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `nonuserorder_pw` varchar(255) NOT NULL,
  PRIMARY KEY (`nonuserorder_num`),
  KEY `nonuserorder_deliver_no_idx` (`nonuserorder_deliver_no`),
  CONSTRAINT `nonuserorder_deliver_no` FOREIGN KEY (`nonuserorder_deliver_no`) REFERENCES `deliver` (`deliver_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='비회원주문';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nonuserorder`
--

LOCK TABLES `nonuserorder` WRITE;
/*!40000 ALTER TABLE `nonuserorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `nonuserorder` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-09 17:10:31
