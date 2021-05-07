-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.5.8-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- dev_db 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `dev_db`;
CREATE DATABASE IF NOT EXISTS `dev_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `dev_db`;

-- 테이블 dev_db.board 구조 내보내기
DROP TABLE IF EXISTS `board`;
CREATE TABLE IF NOT EXISTS `board` (
  `board_no` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `content` text DEFAULT NULL,
  `writer` varchar(50) NOT NULL,
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`board_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.board:~0 rows (대략적) 내보내기
DELETE FROM `board`;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
/*!40000 ALTER TABLE `board` ENABLE KEYS */;

-- 테이블 dev_db.charge_coin_history 구조 내보내기
DROP TABLE IF EXISTS `charge_coin_history`;
CREATE TABLE IF NOT EXISTS `charge_coin_history` (
  `history_no` int(11) NOT NULL AUTO_INCREMENT,
  `user_no` int(5) NOT NULL,
  `amount` int(5) NOT NULL,
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`history_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.charge_coin_history:~0 rows (대략적) 내보내기
DELETE FROM `charge_coin_history`;
/*!40000 ALTER TABLE `charge_coin_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `charge_coin_history` ENABLE KEYS */;

-- 테이블 dev_db.code_class 구조 내보내기
DROP TABLE IF EXISTS `code_class`;
CREATE TABLE IF NOT EXISTS `code_class` (
  `class_code` char(3) NOT NULL,
  `class_name` varchar(30) NOT NULL,
  `use_yn` char(1) NOT NULL DEFAULT 'Y',
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `upd_date` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`class_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.code_class:~0 rows (대략적) 내보내기
DELETE FROM `code_class`;
/*!40000 ALTER TABLE `code_class` DISABLE KEYS */;
/*!40000 ALTER TABLE `code_class` ENABLE KEYS */;

-- 테이블 dev_db.code_detail 구조 내보내기
DROP TABLE IF EXISTS `code_detail`;
CREATE TABLE IF NOT EXISTS `code_detail` (
  `class_code` char(3) NOT NULL,
  `code_value` varchar(3) NOT NULL,
  `code_name` varchar(30) NOT NULL,
  `sort_seq` int(11) NOT NULL,
  `use_yn` char(1) NOT NULL DEFAULT 'Y',
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `upd_date` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`class_code`,`code_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.code_detail:~0 rows (대략적) 내보내기
DELETE FROM `code_detail`;
/*!40000 ALTER TABLE `code_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `code_detail` ENABLE KEYS */;

-- 테이블 dev_db.item 구조 내보내기
DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `item_id` int(5) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(20) DEFAULT NULL,
  `price` int(6) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `picture_uri` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.item:~0 rows (대략적) 내보내기
DELETE FROM `item`;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;

-- 테이블 dev_db.member 구조 내보내기
DROP TABLE IF EXISTS `member`;
CREATE TABLE IF NOT EXISTS `member` (
  `user_no` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL,
  `user_pw` varchar(100) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `job` varchar(3) NOT NULL DEFAULT '00',
  `coin` int(10) DEFAULT 0,
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `upd_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `enabled` char(1) DEFAULT '1',
  PRIMARY KEY (`user_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.member:~0 rows (대략적) 내보내기
DELETE FROM `member`;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;

-- 테이블 dev_db.member_auth 구조 내보내기
DROP TABLE IF EXISTS `member_auth`;
CREATE TABLE IF NOT EXISTS `member_auth` (
  `user_no` int(5) NOT NULL,
  `auth` varchar(50) NOT NULL,
  KEY `fk_member_auth_user_no` (`user_no`),
  CONSTRAINT `fk_member_auth_user_no` FOREIGN KEY (`user_no`) REFERENCES `member` (`user_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.member_auth:~0 rows (대략적) 내보내기
DELETE FROM `member_auth`;
/*!40000 ALTER TABLE `member_auth` DISABLE KEYS */;
/*!40000 ALTER TABLE `member_auth` ENABLE KEYS */;

-- 테이블 dev_db.notice 구조 내보내기
DROP TABLE IF EXISTS `notice`;
CREATE TABLE IF NOT EXISTS `notice` (
  `notice_no` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `content` text DEFAULT NULL,
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`notice_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.notice:~0 rows (대략적) 내보내기
DELETE FROM `notice`;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;

-- 테이블 dev_db.pds 구조 내보내기
DROP TABLE IF EXISTS `pds`;
CREATE TABLE IF NOT EXISTS `pds` (
  `item_id` int(5) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(20) DEFAULT NULL,
  `view_cnt` int(6) DEFAULT 0,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.pds:~0 rows (대략적) 내보내기
DELETE FROM `pds`;
/*!40000 ALTER TABLE `pds` DISABLE KEYS */;
/*!40000 ALTER TABLE `pds` ENABLE KEYS */;

-- 테이블 dev_db.pds_attach 구조 내보내기
DROP TABLE IF EXISTS `pds_attach`;
CREATE TABLE IF NOT EXISTS `pds_attach` (
  `fullName` varchar(150) NOT NULL,
  `item_id` int(5) NOT NULL,
  `down_cnt` int(6) DEFAULT 0,
  `regdate` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`fullName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.pds_attach:~0 rows (대략적) 내보내기
DELETE FROM `pds_attach`;
/*!40000 ALTER TABLE `pds_attach` DISABLE KEYS */;
/*!40000 ALTER TABLE `pds_attach` ENABLE KEYS */;

-- 테이블 dev_db.persistent_logins 구조 내보내기
DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE IF NOT EXISTS `persistent_logins` (
  `username` varchar(64) NOT NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(64) NOT NULL,
  `last_used` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.persistent_logins:~0 rows (대략적) 내보내기
DELETE FROM `persistent_logins`;
/*!40000 ALTER TABLE `persistent_logins` DISABLE KEYS */;
/*!40000 ALTER TABLE `persistent_logins` ENABLE KEYS */;

-- 테이블 dev_db.user_item 구조 내보내기
DROP TABLE IF EXISTS `user_item`;
CREATE TABLE IF NOT EXISTS `user_item` (
  `user_item_no` int(11) NOT NULL AUTO_INCREMENT,
  `user_no` int(5) NOT NULL,
  `item_id` int(5) NOT NULL,
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`user_item_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 dev_db.user_item:~0 rows (대략적) 내보내기
DELETE FROM `user_item`;
/*!40000 ALTER TABLE `user_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_item` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
