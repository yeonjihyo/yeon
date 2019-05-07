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
-- Table structure for table `buy`
--

DROP TABLE IF EXISTS `buy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `buy` (
  `buy_no` int(11) NOT NULL AUTO_INCREMENT COMMENT '구매번호',
  `buy_user_id` varchar(45) NOT NULL COMMENT '아이디',
  `buy_product_code` varchar(45) NOT NULL COMMENT '제품코드',
  `buy_deliver_no` int(11) NOT NULL DEFAULT '0' COMMENT '배송번호',
  `buy_state` varchar(10) DEFAULT NULL COMMENT '주문상태',
  `buy_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '구매일',
  `buy_count` int(11) DEFAULT '1',
  PRIMARY KEY (`buy_no`),
  KEY `buy_user_id_idx` (`buy_user_id`),
  KEY `buy_product_code_idx` (`buy_product_code`),
  KEY `buy_deliver_no_idx` (`buy_deliver_no`),
  CONSTRAINT `buy_deliver_no` FOREIGN KEY (`buy_deliver_no`) REFERENCES `deliver` (`deliver_no`),
  CONSTRAINT `buy_product_code` FOREIGN KEY (`buy_product_code`) REFERENCES `product` (`product_code`),
  CONSTRAINT `buy_user_id` FOREIGN KEY (`buy_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='구매';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buy`
--

LOCK TABLES `buy` WRITE;
/*!40000 ALTER TABLE `buy` DISABLE KEYS */;
INSERT INTO `buy` VALUES (1,'a123','tool001001',1,'결제완료','2019-05-03 14:27:52',1),(2,'a123','edgecoat001001',1,'결제완료','2019-05-03 14:27:52',1),(3,'b123','thread001001',2,'배송완료','2019-05-03 15:11:49',2);
/*!40000 ALTER TABLE `buy` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-07 16:51:32
