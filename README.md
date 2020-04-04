# Pharmacy-Management
Project as part of training.A simple web application for Pharmacy Management.This application is developed for a pharmacy manager
where he is able to create new pharmacy products, view available stock and update/delete/retrieve the details. It also has a search module where the manager can search the medicines's names.
Software Requirements:
Java 1.8+,Tomcat Server 7.0 or above,MySQL Database 5.0 or above,Eclipse IDE/STS 2018-19,Maven 3.0 or above,Junit 4.

Here is the Database Script I used.

CREATE DATABASE  IF NOT EXISTS `pharma_db`;
use `pharma_db`;
CREATE TABLE `pharmacy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `price` double(9,3) DEFAULT NULL,
  `manufacturer` varchar(45) DEFAULT NULL,
  `date_of_expiry` date default null,
  `batch_no` int(11) default null,
  `units_available` int(11) default null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

create table `login`(
 `id` int(11) NOT NULL ,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;

drop table login;
insert into login values(1,'User','user@123');
insert into login values(2,'Abc','abc@321');
