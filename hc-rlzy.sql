/*
Navicat MySQL Data Transfer

Source Server         : tsfb-dev
Source Server Version : 50637
Source Host           : 192.168.3.55:3306
Source Database       : hc-rlzy

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2018-03-22 16:35:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `hc_user`
-- ----------------------------
DROP TABLE IF EXISTS `hc_user`;
CREATE TABLE `hc_user` (
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `nation` int(4) DEFAULT NULL,
  `type` int(4) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hc_user
-- ----------------------------
