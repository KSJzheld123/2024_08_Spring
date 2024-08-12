# Article Table의 정보
DROP TABLE `member`;
DROP TABLE IF EXISTS article;
CREATE TABLE article(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	title VARCHAR(20) NOT NULL,
	`body` TEXT(20) NOT NULL,
	writerId INT UNSIGNED NOT NULL
);

CREATE TABLE `member`(
      id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
      regDate DATETIME NOT NULL,
      updateDate DATETIME NOT NULL,
      loginId CHAR(30) NOT NULL,
      loginPw CHAR(100) NOT NULL,
      `authLevel` SMALLINT(2) UNSIGNED DEFAULT 3 COMMENT '권한 레벨 (3=일반,7=관리자)',
      `name` CHAR(20) NOT NULL,
      nickname CHAR(20) NOT NULL,
      cellphoneNum CHAR(20) NOT NULL,
      email CHAR(50) NOT NULL,
      delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '탈퇴 여부 (0=탈퇴 전, 1=탈퇴 후)',
      delDate DATETIME COMMENT '탈퇴 날짜'
);

SELECT * 
FROM article AS a LEFT JOIN `member` AS m ON a.writerId = m.id ORDER BY a.id DESC;

INSERT INTO article SET regDate = NOW(), updateDate = NOW(), title = "제목1", `body` = "내용1", writerId = 1;
INSERT INTO article SET regDate = NOW(), updateDate = NOW(), title = "제목2", `body` = "내용2", writerId = 2;
INSERT INTO article SET regDate = NOW(), updateDate = NOW(), title = "제목3", `body` = "내용3", writerId = 3;
INSERT INTO article SET regDate = NOW(), updateDate = NOW(), title = "제목4", `body` = "내용4", writerId = 4;

INSERT INTO `member` SET regDate = NOW(), updateDate = NOW(), loginId = "관리자", loginPw = "관리자", `name` = "관리자", nickname = "관리자", cellphoneNum = "01000000000", email = "qqq@qqq.com", authLevel = 7;
INSERT INTO `member` SET regDate = NOW(), updateDate = NOW(), loginId = "test1", loginPw = "test1", `name` = "test1", nickname = "test1", cellphoneNum = "01012341234", email = "qwe@qwe.com";
INSERT INTO `member` SET regDate = NOW(), updateDate = NOW(), loginId = "test2", loginPw = "test2", `name` = "test2", nickname = "test2", cellphoneNum = "01023452345", email = "asd@asd.com";
INSERT INTO `member` SET regDate = NOW(), updateDate = NOW(), loginId = "test3", loginPw = "test3", `name` = "test3", nickname = "test3", cellphoneNum = "01034563456", email = "zxc@zxc.com";

SELECT * FROM `member`;
SELECT * FROM article;
