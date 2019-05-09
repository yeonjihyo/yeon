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
-- Table structure for table `nonuserlist`
--

DROP TABLE IF EXISTS `nonuserlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nonuserlist` (
  `nonuserlist_no` int(11) NOT NULL AUTO_INCREMENT,
  `nonuserlist_nonuserorder_num` varchar(45) NOT NULL,
  `nonuserlist_product_code` varchar(45) NOT NULL,
  `nonuserlist_count` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`nonuserlist_no`),
  KEY `nonuserlist_nonuserorder_num_idx` (`nonuserlist_nonuserorder_num`),
  KEY `nonuserlist_product_code_idx` (`nonuserlist_product_code`),
  CONSTRAINT `nonuserlist_nonuserorder_num` FOREIGN KEY (`nonuserlist_nonuserorder_num`) REFERENCES `nonuserorder` (`nonuserorder_num`),
  CONSTRAINT `nonuserlist_product_code` FOREIGN KEY (`nonuserlist_product_code`) REFERENCES `product` (`product_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='비회원주문제품리스트';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nonuserlist`
--

LOCK TABLES `nonuserlist` WRITE;
/*!40000 ALTER TABLE `nonuserlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `nonuserlist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-09 17:09:38
