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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `product_code` varchar(45) NOT NULL,
  `product_title` varchar(45) DEFAULT NULL,
  `product_contents` longtext,
  `product_maincategory` varchar(45) DEFAULT NULL,
  `product_subcategory` varchar(45) DEFAULT NULL,
  `product_price` int(11) NOT NULL DEFAULT '0',
  `product_made` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`product_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='제품';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('edgecoat001001','페니체 25ML 6499(블랙)','이태리 페니체 엣지코트','엣지코트&염료(EDGE COAT)','페니체',3300,'이탈리아'),('edgecoat002001','국산엣지코트 150ML YKK848','국산 엣지코트','엣지코트&염료(EDGE COAT)','기리메',3300,'국산'),('edgecoat002002','국산엣지코트 150ML RED','국산 엣지코트','엣지코트&염료(EDGE COAT)','기리메',3300,'국산'),('thread001001','린카블레532 BLEU 266 ','린카블레532 BLEU 266 ','실(THREAD)','린카블레',33000,'프랑스'),('thread001002','린카블레532 JADE 448','린카블레532 JADE 448','실(THREAD)','린카블레',33000,'프랑스'),('thread001003','린카블레532 BIS 571','린카블레532 BIS 571','실(THREAD)','린카블레',33000,'프랑스'),('tool001001','동경수차 재단칼 오른손용','일제재단칼 오른손용','공구(TOOL)','재단도구',25000,'일본'),('tool001002','동경수차 재단칼 왼손용','일제재단칼 왼손용','공구(TOOL)','재단도구',25000,'일본');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-03 17:21:26
