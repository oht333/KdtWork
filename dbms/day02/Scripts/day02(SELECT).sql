--1번

-- 정렬해서 조회하기
-- ORDER BY절
-- 사원의 이름, 성, 급여를 급여 낮은 순서부터 조회하기

SELECT first_name, last_name, salary --2) first_name, last_name, salary컬럼을 조회할거야
FROM employees    -- 1) EMPLOYEES 테이블에서
ORDER BY salary ASC; --3) salary의 오름차순으로 정렬해서
-- ASC : 오름차순(ascending) 앞글자 3글자만 따서 ASC로 사용한다
-- DESC : 내림차순(descending) 앞글자 4글자를 따서 DESC로 사용한다

SELECT first_name, last_name, salary
FROM employees 
ORDER BY SALARY DESC;

SELECT * FROM employees;

-- 문자의 정렬 (first_name)   ASC : a부터 z까지 순으로 정렬
SELECT first_name
FROM employees
ORDER BY first_name ASC;

-- 날짜의 정렬 (hire_date) ASC : 예전날짜부터 최신날짜 순으로 정렬
SELECT hire_date
FROM employees 
ORDER BY hire_date DESC;
-- ORDER BY 절에서 오름차순 ASC나 내림차순 DESC를 생략하면 오름차순으로 정렬된다!

SELECT * FROM EMPLOYEES;

-- ORDER BY절의 컬럼명은 조회하는 컬럼명과 반드시 일치하지 않아도 가능하다(해당 테이블에 있는 컬럼이라면)
-- 2개의 정렬기준도 가능하다
-- 첫번째 작성한 컬럼의 값을 기준을 잡아 정렬하고 해당 컬럼의 값이 동일하다면 2차적으로 그다음 컬럼값을 기준으로 정렬한다
SELECT first_name, SALARY
FROM EMPLOYEES
ORDER BY first_name ASC, salary ASC; --둘다 오름차순이면 생략 가능하다 (ORDER BY first_name, salary;)

-- 사원 테이블에서 직급을 조회하기

SELECT JOB_ID 
FROM EMPLOYEES;

-- 직급의 종류를 확인하기 위해 중복 행을 제거
-- DISTINCT : 해당 컬럼에서 중복되는 값을 제외시킨다
SELECT DISTINCT job_id
FROM EMPLOYEES; 

-- 칼럼을 여러개 넣으면 DISTINCE는 어떻게 작동될까? : job_id도 중복되고 hire_date도 중복되어있는 값이 제외됐음 (중복된 수가 적다)
-- 여러 칼럼을 동시에 작성할 경우 두개의 컬럼이 모두 중복되는 경우에만 중복처리한다(중복을 제거한다)
SELECT DISTINCT job_id, hire_date
FROM EMPLOYEES;

-- 별칭 붙여 조회하기
SELECT first_name AS "이름", last_name AS "성", salary AS "봉급", employee_id AS "사원 번호"
FROM employees;

-- AS 키워드 생략 가능
--"" 생략 가능 (단 별칭에 띄어쓰기가 있으면 생략 불가능 하므로 ""를 붙일 것)
SELECT first_name 이름, last_name 성, salary 봉급, employee_id "사원 번호"
FROM employees;

--사원의 이름(first_name), 성(last_name), 봉급을 조회하는데 봉급 내림차순으로 별칭사용하여 조회하기
-- 쿼리문 작성시 순서 1) 조회할 컬럼 생각 -> 별칭 부여 2) 테이블 생각 3) 정렬 생각 
-- 쿼리문 실행순서 FROM -> SELECT -> ORDER BY
SELECT first_name 이름, last_name 성, salary 봉급
FROM EMPLOYEES
ORDER BY 봉급 DESC; -- 별칭을 써도 된다


SELECT * FROM EMPLOYEES;
