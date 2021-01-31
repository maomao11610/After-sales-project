/*
 Navicat Premium Data Transfer

 Source Server         : liang
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : aftersalessystem

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 30/12/2020 11:50:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for indent
-- ----------------------------
DROP TABLE IF EXISTS `indent`;
CREATE TABLE `indent`  (
  `indent_id` int(0) NOT NULL AUTO_INCREMENT,
  `user_id` int(0) NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `user_sex` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `user_phonenum` char(11) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `user_address` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `service_id` int(0) NULL DEFAULT NULL,
  `worker_id` int(0) NULL DEFAULT NULL,
  `maintain_kind` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `cost` decimal(10, 2) NULL DEFAULT NULL,
  `is_cost` tinyint(1) NULL DEFAULT NULL,
  `is_order` tinyint(1) NULL DEFAULT NULL,
  `is_over` tinyint(1) NULL DEFAULT NULL,
  `user_comment` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`indent_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of indent
-- ----------------------------
INSERT INTO `indent` VALUES (6, 103, '白欢换', '女', '31351351313', '榆林市', 100, 102, '种类1', 110.84, 1, 1, 1, '啦啦啦啦啦');
INSERT INTO `indent` VALUES (7, 103, '袁洋洋', '女', '31351351313', '安康', NULL, NULL, '种类1', 182.65, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` tinyint(0) NULL DEFAULT NULL,
  `regist_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(0) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `kind` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (100, '100', '客服');
INSERT INTO `user` VALUES (101, '101', '管理员');
INSERT INTO `user` VALUES (102, '102', '维修员');
INSERT INTO `user` VALUES (103, '103', '客户');
INSERT INTO `user` VALUES (104, '104', '客户');
INSERT INTO `user` VALUES (105, '105', '客户');

-- ----------------------------
-- Table structure for user_information
-- ----------------------------
DROP TABLE IF EXISTS `user_information`;
CREATE TABLE `user_information`  (
  `user_id` int(0) NOT NULL,
  `name` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `phonenum` char(11) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_information
-- ----------------------------
INSERT INTO `user_information` VALUES (100, '张三', '男', '12345678964');
INSERT INTO `user_information` VALUES (101, '李四', '男', '14621427456');
INSERT INTO `user_information` VALUES (102, '小红', '女', '41262732747');
INSERT INTO `user_information` VALUES (103, '小李', '男', '5451535486');
INSERT INTO `user_information` VALUES (104, '小张', '女', '21351313213');
INSERT INTO `user_information` VALUES (105, '小黄', '女', '35135121333');

-- ----------------------------
-- Table structure for users1
-- ----------------------------
DROP TABLE IF EXISTS `users1`;
CREATE TABLE `users1`  (
  `user_id` int(0) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `kind` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 132 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users1
-- ----------------------------
INSERT INTO `users1` VALUES (100, '100', '客服');
INSERT INTO `users1` VALUES (101, '101', '管理员');
INSERT INTO `users1` VALUES (102, '102', '维修员');
INSERT INTO `users1` VALUES (103, '103', '客户');
INSERT INTO `users1` VALUES (104, '104', '客户');
INSERT INTO `users1` VALUES (105, '105', '客户');
INSERT INTO `users1` VALUES (106, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (107, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (108, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (109, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (110, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (111, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (112, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (113, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (114, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (115, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (116, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (117, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (118, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (119, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (120, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (121, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (122, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (123, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (124, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (125, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (126, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (127, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (128, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (129, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (130, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (131, '202cb962ac59075b964b07152d234b70', '客户');
INSERT INTO `users1` VALUES (132, '202cb962ac59075b964b07152d234b70', '客户');

-- ----------------------------
-- View structure for 用户列表
-- ----------------------------
DROP VIEW IF EXISTS `用户列表`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `用户列表` AS select `user`.`user_id` AS `user_id` from `user`;

-- ----------------------------
-- Procedure structure for select_all
-- ----------------------------
DROP PROCEDURE IF EXISTS `select_all`;
delimiter ;;
CREATE PROCEDURE `select_all`()
BEGIN
DECLARE I INT DEFAULT 1;
	WHILE I<10 DO
	INSERT INTO `users1`	
	VALUES(DEFAULT,MD5('123'),'客户');
	SET I = I+1;
  END WHILE;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
