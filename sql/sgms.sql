/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : sgms

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-03-02 20:31:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adname` varchar(255) NOT NULL,
  `adpsw` varchar(255) NOT NULL,
  PRIMARY KEY (`adname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) NOT NULL,
  `cteacher` varchar(255) NOT NULL,
  `ctime` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  PRIMARY KEY (`cid`),
  KEY `cteacher` (`cteacher`),
  CONSTRAINT `cteacher` FOREIGN KEY (`cteacher`) REFERENCES `teacher` (`tname`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=143 DEFAULT CHARSET=utf8 COMMENT='InnoDB free: 7168 kB; (`cteacher`) REFER `gradesystem/teache';

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `sid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `result` int(4) NOT NULL DEFAULT '-1',
  PRIMARY KEY (`sid`,`cid`),
  KEY `cid` (`cid`),
  CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `course` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sid` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `spw` varchar(255) NOT NULL DEFAULT '123456' COMMENT '默认密码123456',
  `sname` varchar(40) NOT NULL,
  `ssex` varchar(10) NOT NULL,
  `department` varchar(255) DEFAULT NULL,
  `class` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=162011260 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tpw` varchar(255) NOT NULL DEFAULT '123456' COMMENT '默认密码：123456',
  `tname` varchar(20) NOT NULL,
  `tsex` varchar(4) NOT NULL,
  PRIMARY KEY (`tid`),
  KEY `tname` (`tname`)
) ENGINE=InnoDB AUTO_INCREMENT=794 DEFAULT CHARSET=utf8;
