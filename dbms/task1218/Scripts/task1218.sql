DROP TABLE TBL_MASTER;

--1번문제
CREATE TABLE TBL_STUDENT(
	STUDENT_NUMBER NUMBER CONSTRAINT PK_STUDENT PRIMARY KEY,
	STUDENT_NAME VARCHAR2(100) NOT NULL,
	STUDENT_AGE NUMBER NOT NULL,
	STUDENT_PHONE VARCHAR2(15) NOT NULL,
	STUDENT_ADDRESS VARCHAR2(100)
);

SELECT * FROM TBL_STUDENT;

CREATE TABLE TBL_JOB(
	JOB_NUMBER NUMBER,
	JOB_NAME VARCHAR2(100) NOT NULL,
	TEACHER_NAME VARCHAR2(100) NOT NULL,
	CLASS_DATE DATE NOT NULL,
	CLASS_TIME TIMESTAMP NOT NULL,
	STUDENT_NUMBER NUMBER,
	CONSTRAINT PK_JOB PRIMARY KEY(JOB_NUMBER),
	CONSTRAINT FK_JOB FOREIGN KEY(STUDENT_NUMBER) REFERENCES TBL_STUDENT(STUDENT_NUMBER)
);

CREATE TABLE TBL_GRADE(
	CLASS_NUMBER NUMBER,
	STUDENT_GRADE CHAR(1) NOT NULL,
	JOB_NUMBER NUMBER NOT NULL,
	CONSTRAINT PK_GRADE PRIMARY KEY(CLASS_NUMBER),
	CONSTRAINT FK_GRADE FOREIGN KEY(JOB_NUMBER) REFERENCES TBL_JOB(JOB_NUMBER)
);

INSERT INTO TBL_STUDENT
--VALUES (1, '윤두준', 37, '010-1234-5678', '서울 서초구');
--VALUES (2, '양요섭', 37, '010-1234-3333', '서울 서초구');
VALUES (3, '이기광', 37, '010-3333-3333', '서울 강남구');

INSERT INTO TBL_JOB
--VALUES (1, '국어', '신형만', '2024-12-18', '2024-12-18 15:30:00', 3);
VALUES (2, '영어', '마이콜', '2024-10-13', '2024-10-13 15:30:00', 3);

INSERT INTO TBL_GRADE
--VALUES (1, 'A', 1);
VALUES (2, 'B', 1);
VALUES (1, 'A', 1);

SELECT * FROM TBL_STUDENT;
SELECT * FROM TBL_JOB;
SELECT * FROM TBL_GRADE;

--2번문제
CREATE TABLE TBL_MASTER(
	MASTER_NUMBER NUMBER CONSTRAINT PK_MASTER PRIMARY KEY,
	MASTER_NAME VARCHAR2(100) NOT NULL,
	MASTER_ADDRESS VARCHAR2(100),
	MASTER_PHONE VARCHAR2(15) NOT NULL,
	MASTER_EMAIL  VARCHAR2(100)
);

CREATE TABLE TBL_ANIMAL(
	ANIMAL_NUMBER NUMBER CONSTRAINT PK_ANIMAL PRIMARY KEY, 
	ANIMAL_SPECIES VARCHAR2(100),
	ANIMAL_BREED VARCHAR2(100) NOT NULL
);

CREATE TABLE TBL_PET(
	PET_NUMBER NUMBER,
	PET_NAME VARCHAR2(100) NOT NULL,
	PET_GENDER VARCHAR2(100) NOT NULL CONSTRAINT CHECK_GENDER CHECK(PET_GENDER = 'M' OR PET_GENDER='W'),
	PET_AGE NUMBER NOT NULL,
	MASTER_NUMBER NUMBER, 
	ANIMAL_NUMBER NUMBER,
	CONSTRAINT PK_PET PRIMARY KEY(PET_NUMBER),
	CONSTRAINT FK_MASTER FOREIGN KEY(MASTER_NUMBER) REFERENCES TBL_MASTER(MASTER_NUMBER),
	CONSTRAINT FK_ANIMAL FOREIGN KEY(ANIMAL_NUMBER) REFERENCES TBL_ANIMAL(ANIMAL_NUMBER)
);

INSERT INTO TBL_MASTER
--VALUES (1, '박형준', '경기도 수원시', '010-3333-3333', 'a@naver.com');
--VALUES (2, '최윤철', '경기도 수원시', '010-3343-3433', 'b@naver.com');
--VALUES (3, '윤기호', '경기도 수원시', '010-3353-3353', 'c@naver.com');
--VALUES (4, '이윤호', '경기도 수원시', '010-1333-3133', 'd@naver.com');
--VALUES (5, '곽태혁', '경기도 수원시', '010-3331-3331', 'e@naver.com');

INSERT INTO TBL_ANIMAL
--VALUES (1, '개', '슈나우저');
--VALUES (2, '개', '푸들');
--VALUES (3, '개', '도베르만');
--VALUES (4, '뱀', '아나콘다');
VALUES (5, '고양이', '페르시안');

INSERT INTO TBL_PET
--VALUES (1, '고구마', 'M', 3, 1, 1);
--VALUES (2, '양파', 'W', 5, 1, 2);
VALUES (3, '야옹이', 'M', 4, 3, 5);


--3번문제
CREATE TABLE TBL_DEPARTMENTADDR(
	DEPARTMENTADDR_NUMBER NUMBER CONSTRAINT PK_DEPARTMENTADDR PRIMARY KEY,
	DEPARTMENTADDR_ADDRESS VARCHAR2(100) NOT NULL,
	ZIPCODE NUMBER NOT NULL
);

CREATE TABLE TBL_DEPARTMENT(
	DEPARTMENT_NUMBER NUMBER,
	DEPARTMENT_NAME VARCHAR2(100) NOT NULL,
	DEPARTMENTADDR_NUMBER NUMBER,
	CONSTRAINT PK_DEPARTMENT PRIMARY KEY(DEPARTMENT_NUMBER),
	CONSTRAINT FK_DEPARTMENT FOREIGN KEY(DEPARTMENTADDR_NUMBER) REFERENCES TBL_DEPARTMENTADDR(DEPARTMENTADDR_NUMBER)
);


CREATE TABLE TBL_EMPLOYEE(
	EMPLOYEE_NUMBER NUMBER,
	EMPLOYEE_NAME VARCHAR2(100) NOT NULL,
	EMPLOYEE_BIRTH DATE NOT NULL,
	DEPARTMENT_NUMBER NUMBER,
	SALARY NUMBER,
	CONSTRAINT PK_EMPLOYEE PRIMARY KEY(EMPLOYEE_NUMBER),
	CONSTRAINT FK_EMPLOYEE FOREIGN KEY(DEPARTMENT_NUMBER) REFERENCES TBL_DEPARTMENT(DEPARTMENT_NUMBER)
);

INSERT INTO TBL_DEPARTMENTADDR 
VALUES (1, '서울시', 01234);
INSERT INTO TBL_DEPARTMENT 
VALUES (1, '영업부', 1);
INSERT INTO TBL_EMPLOYEE
VALUES (1, '스티븐', TO_DATE('2010-12-31', 'YYYY-MM-DD'), 1, 300);


INSERT INTO TBL_DEPARTMENTADDR 
VALUES (2, '서울시', 01234);
INSERT INTO TBL_DEPARTMENT 
VALUES (2, '영업부', 2);
INSERT INTO TBL_EMPLOYEE 
VALUES (2, '마리', TO_DATE('2011-10-01', 'YYYY-MM-DD'), 2, 250);


INSERT INTO TBL_DEPARTMENTADDR 
VALUES (3, '경기도', 02345);
INSERT INTO TBL_DEPARTMENT  
VALUES (3, '사업부', 3);
INSERT INTO TBL_EMPLOYEE 
VALUES (3, '찰스', TO_DATE('2003-05-01', 'YYYY-MM-DD'), 3, 200);


