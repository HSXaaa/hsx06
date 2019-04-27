/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : db_spring

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-04-27 15:31:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('2', '张三', '12');
INSERT INTO `t_student` VALUES ('3', '张三', '12');
INSERT INTO `t_student` VALUES ('4', '张三', '12');
INSERT INTO `t_student` VALUES ('5', '张三', '12');
INSERT INTO `t_student` VALUES ('6', '王五2', '2');
INSERT INTO `t_student` VALUES ('7', '张三', '12');
INSERT INTO `t_student` VALUES ('9', '王五', '1');
INSERT INTO `t_student` VALUES ('10', '王五', '1');
INSERT INTO `t_student` VALUES ('11', '王五', '1');
INSERT INTO `t_student` VALUES ('12', '王五', '1');
