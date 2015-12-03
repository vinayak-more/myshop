-- MySQL dump 10.13  Distrib 5.6.24, for linux-glibc2.5 (x86_64)
--
-- Host: localhost    Database: myshop
-- ------------------------------------------------------
-- Server version	5.6.27-0ubuntu0.15.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) DEFAULT NULL COMMENT 'primary key of customer table to map one customer to multiple addresses',
  `address_line_1` varchar(755) DEFAULT NULL,
  `address_line_2` varchar(755) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `pin_code` int(6) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `landmark` varchar(700) DEFAULT NULL,
  `address_type` varchar(45) NOT NULL DEFAULT 'Home',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COMMENT='use to store addresses of customer, one to many mapping in customer and addresses';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,1,'3rd Floore,High tech plaza','Mahakali caves Road, Andheri(EAST)','Mumbai','Maharashtra',400093,'India',NULL,'Office or Commercial'),(2,1,'3rd Floore,High tech plaza','Mahakali caves Road, Andheri(EAST)','Mumbai','Maharashtra',400093,'India',NULL,'Office or Commercial'),(3,1,'3rd Floore,High tech plaza','Mahakali caves Road, Andheri(EAST)','Mumbai','Maharashtra',400093,'India',NULL,'Office or Commercial'),(4,1,'3rd Floore,High tech plaza','Mahakali caves Road, Andheri(EAST)','Mumbai','Maharashtra',400093,'India',NULL,'Office or Commercial');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(700) DEFAULT NULL,
  `lname` varchar(700) DEFAULT NULL,
  `mobile` varchar(13) DEFAULT NULL,
  `username` varchar(700) DEFAULT NULL,
  `password` varchar(700) DEFAULT NULL COMMENT 'must be hash value',
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Ram','More','8888888888','vinayak','infi@123',NULL),(2,'Mukesh','Shinde','8888888888','mukesh','infi@123',NULL),(3,'1234','1234','0',NULL,NULL,NULL),(4,'1234','1234','0',NULL,NULL,NULL),(5,'1234','1234','0',NULL,NULL,NULL),(6,'qwer','qwer','0',NULL,NULL,NULL),(7,'qwer','qwer','0',NULL,NULL,NULL),(8,'qwer','qwer','0',NULL,NULL,NULL),(9,'qwer','qwer','0',NULL,NULL,NULL),(10,'qwer','qwer','0',NULL,NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email_template`
--

DROP TABLE IF EXISTS `email_template`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email_template` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `email_type` varchar(100) NOT NULL,
  `email_from` varchar(100) NOT NULL DEFAULT 'noreply@myshop.com',
  `email_subject` varchar(100) NOT NULL,
  `email_body_template` varchar(750) NOT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email_template`
--

LOCK TABLES `email_template` WRITE;
/*!40000 ALTER TABLE `email_template` DISABLE KEYS */;
/*!40000 ALTER TABLE `email_template` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `images` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `image_path` varchar(700) DEFAULT 'no_image.jpg',
  `product_id` int(11) NOT NULL,
  PRIMARY KEY (`rid`),
  KEY `product-image_idx` (`product_id`),
  KEY `FKB95A8278EAA5D283` (`product_id`),
  CONSTRAINT `FKB95A8278EAA5D283` FOREIGN KEY (`product_id`) REFERENCES `product` (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
INSERT INTO `images` VALUES (1,'no_image.jpg',1),(2,'P1234.jpg',2),(3,'P1235.jpg',3),(4,'P1236.jpg',4);
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_master`
--

DROP TABLE IF EXISTS `order_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_master` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `booking_id` varchar(45) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `booking_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delievery_date` timestamp NULL DEFAULT NULL,
  `payment_method` varchar(45) DEFAULT NULL,
  `amount_paid` float DEFAULT NULL,
  `amount_balance` float DEFAULT NULL,
  `discount_given` float DEFAULT NULL,
  `discount_in_percent` float DEFAULT NULL,
  `amount_balanced` float DEFAULT NULL,
  `booking_status` varchar(45) NOT NULL,
  PRIMARY KEY (`rid`),
  KEY `order_customer_idx` (`customer_id`),
  KEY `order+product_idx` (`product_id`),
  CONSTRAINT `order+customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`rid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `order+product` FOREIGN KEY (`product_id`) REFERENCES `product` (`rid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_master`
--

LOCK TABLES `order_master` WRITE;
/*!40000 ALTER TABLE `order_master` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_product`
--

DROP TABLE IF EXISTS `order_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_product` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  KEY `order_table_FK_idx` (`order_id`),
  KEY `fk_order_product_1_idx` (`product_id`),
  CONSTRAINT `order_table_FK` FOREIGN KEY (`order_id`) REFERENCES `order_master` (`rid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `product_table_FK` FOREIGN KEY (`product_id`) REFERENCES `product` (`rid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_product`
--

LOCK TABLES `order_product` WRITE;
/*!40000 ALTER TABLE `order_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(700) NOT NULL,
  `seller` varchar(700) DEFAULT NULL,
  `base_price` float DEFAULT NULL,
  `sale_price` float DEFAULT NULL,
  `discount` float DEFAULT NULL,
  `discount_in_percent` float DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `description` varchar(700) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `manufacturer` varchar(45) DEFAULT NULL,
  `units_in_stock` int(11) DEFAULT NULL,
  `units_in_order` int(11) DEFAULT NULL,
  `pcondition` varchar(45) DEFAULT NULL,
  `product_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Oneplus X','Amazon',16999,16999,0,0,4.5,'Oneplus X New Model, 3GB RAM, 16GB ROM, expandable, dual SIM, 13MP-8MP Camera','Mobile','Oneplus',100,30,'New','P1238'),(2,'iPhone 5s	','Apple',24999,24999,0,0,4.5,'Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera','Mobile','Apple',1000,0,'New','P1234'),(3,'Dell Inspiron','Dell',45000,45000,0,0,5,'Dell Inspiron 14-inch Laptop(Black) with 3rd Generation Intel Core processors','Laptop','Dell',1000,0,'New','P1235'),(4,'Nexus 7','Google',30000,30000,0,0,6,'Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm SnapdragonTM S4 Pro processor','Mobile','Google',985,0,'New','P1236');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `user_type` varchar(45) NOT NULL,
  `user_creation_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_last_logging_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `v_product`
--

DROP TABLE IF EXISTS `v_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `v_product` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` varchar(45) DEFAULT NULL,
  `product_name` varchar(700) DEFAULT NULL,
  `unit_price` varchar(45) DEFAULT NULL,
  `description` varchar(700) DEFAULT NULL,
  `manufacturer` varchar(700) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `unit_in_stock` int(11) DEFAULT NULL,
  `unit_in_order` int(11) DEFAULT NULL,
  `discounted` int(11) DEFAULT '0',
  `condition` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `v_product`
--

LOCK TABLES `v_product` WRITE;
/*!40000 ALTER TABLE `v_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `v_product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-26 12:28:22
