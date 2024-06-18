CREATE DATABASE  IF NOT EXISTS `socialmedia`;
USE `socialmedia`;

DROP TABLE IF EXISTS `socialmedia`;
CREATE TABLE `socialmedia`(
	`id` int NOT NULL AUTO_INCREMENT,
	`post_title` varchar(145) DEFAULT NULL,
	`description` varchar(345) DEFAULT NULL,
	PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `socialmedia` VALUES
			(1,'First Post','Lorem Ipsum is simply dummy text of the printing and typesetting industry.');