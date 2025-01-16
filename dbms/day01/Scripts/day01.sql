-- sql 주석 (ctrl + /)
-- 주석 처리된 sql문은 실행되지 않는다
-- 한줄 주석 -- : 해당 라인 줄을 주석 처리
/* 범위주석 (ctrl + shift + /)  
 * 범위 안에 있는 라인을 주석처리
 */

-- 글자크기 변환 (ctrl + '+'or'-')

-- select를 사용하여 employees 테이블의 모든 칼럼 조회하기
SELECT * FROM hr.employees; -- 실행 : ctrl + Enter (hr계정에 있는 employees테이블에 있는 정보를 조회한다)

-- select를 사용하여 employees 테이블의 first_name 칼럼만 선택하여 조회하기
SELECT first_name FROM employees;

-- ; 세미콜론 : 세미콜론은 하나의 명령이 끝나면 작성한다(마침표라고 생각하면 된다)
-- 세미콜론을 적어야 한 줄의 끝이라고 생각하기 때문에 세미콜론 이전에 줄바꿈해도 상관없다
-- SQL문은 대소문자를 구분하지 않는다.
SELECT 
FIRST_NAME 
FROM HR.EMPLOYEES;	--hr.을 생략해도 가능한데 그 이유는 hr계정으로 로그인을 했기 때문이다