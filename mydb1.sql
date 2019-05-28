/*
Navicat MySQL Data Transfer

Source Server         : mycon1
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : mydb1

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2019-03-30 16:52:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `myadmin`
-- ----------------------------
DROP TABLE IF EXISTS `myadmin`;
CREATE TABLE `myadmin` (
  `id` char(6) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of myadmin
-- ----------------------------
INSERT INTO `myadmin` VALUES ('123456', '123456');
INSERT INTO `myadmin` VALUES ('654321', '654321');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` char(8) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `sex` char(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('10101010', '哈好', '女', '33');
INSERT INTO `student` VALUES ('11009988', '孙悟空', '男', '22');
INSERT INTO `student` VALUES ('11111111', '周大侠', '男', '20');
INSERT INTO `student` VALUES ('123456', '乱了', '男', '11');
INSERT INTO `student` VALUES ('22222222', '结衣', '女', '20');
INSERT INTO `student` VALUES ('2232123', '模拟', '女', '22');
INSERT INTO `student` VALUES ('2233223', '看看看', '女', '11');
INSERT INTO `student` VALUES ('223344', '直接', '男', '77');
INSERT INTO `student` VALUES ('3322176', '你们', '男', '78');
INSERT INTO `student` VALUES ('33333333', '周杰', '男', '20');
INSERT INTO `student` VALUES ('43224322', '莫妮卡', '男', '13');
INSERT INTO `student` VALUES ('4343233', '框架', '男', '24');
INSERT INTO `student` VALUES ('44444444', '晓燕', '男', '21');
INSERT INTO `student` VALUES ('55555555', '邵衰', '男', '22');
INSERT INTO `student` VALUES ('666666', '陈璐', '女', '24');
INSERT INTO `student` VALUES ('6754543', '与他', '女', '33');
INSERT INTO `student` VALUES ('77777777', '李凡', '女', '24');
INSERT INTO `student` VALUES ('77883243', '你们俩', '女', '55');
INSERT INTO `student` VALUES ('7885432', '六九', '男', '14');
INSERT INTO `student` VALUES ('8787876', '考虑', '男', '66');
INSERT INTO `student` VALUES ('88888888', '路飞', '男', '25');
INSERT INTO `student` VALUES ('99999999', '马会', '男', '23');
