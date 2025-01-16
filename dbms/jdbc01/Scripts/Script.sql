CREATE SEQUENCE seq_user;

-- 사용자 정보 저장하는 유저 테이블 tbl_user
-- 사용자 번호
-- 아이디
-- 패스워드
-- 이름
-- 나이
-- 성별
-- 생일
CREATE TABLE tbl_user(
   user_number NUMBER,
   user_id varchar2(100),
   user_pw varchar2(100),
   user_name varchar2(10),
   user_age NUMBER,
   user_gender char(1) DEFAULT 'M',
   user_birth DATE,
   CONSTRAINT pk_user PRIMARY key(user_number)
);

SELECT * FROM tbl_user;

SELECT * FROM TBL_BOOK tb ;

INSERT INTO tbl_user
--values(seq_user.nextVal, 'aaa', '1234', '홍길동', 22, 'M', '20001010');
--values(seq_user.nextVal, 'bbb', '1234', '오현택', 31, 'M', '20000710');

SELECT user_number FROM tbl_user WHERE user_id = 'aaa';



DROP TABLE tbl_user;
DROP TABLE tbl_book;

CREATE SEQUENCE seq_user;
CREATE SEQUENCE seq_book;

CREATE TABLE tbl_user (
   user_number NUMBER,
   user_id VARCHAR2(100) NOT NULL,
   user_pw VARCHAR2(100) NOT NULL,
   user_name VARCHAR2(100) NOT NULL,
   user_phone VARCHAR2(100) UNIQUE NOT NULL,
   CONSTRAINT pk_user PRIMARY KEY(user_number)
);

CREATE TABLE tbl_book (
   book_number NUMBER,
   book_title VARCHAR2(100) NOT NULL,
   book_author VARCHAR2(100) NOT NULL,
   book_rent  VARCHAR2(100) DEFAULT 'false' NOT NULL
   CONSTRAINT check_rent CHECK(book_rent = 'true' OR book_rent = 'false'),
   CONSTRAINT pk_book PRIMARY KEY(book_number)
);

SELECT * FROM tbl_user;
SELECT * FROM tbl_book;

