-- sys as sysdba 계정의 스크립트
GRANT UPDATE, INSERT, DELETE ON employees TO test; --에러

REVOKE UPDATE, INSERT, DELETE, SELECT ON hr.employees FROM test; --UPDATE, INSERT, DELETE 는 권한이 에초에 없었으니 에러

REVOKE SELECT ON hr.employees FROM test; --hr 붙일것 (정상작동)

SELECT username, default_tablespace
FROM dba_users;
--WHERE username = 'TEST01';