-- Project Name : sample_er
-- Date/Time    : 2022/11/13 15:07:17
-- Author       : halo1
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- 社員
DROP TABLE if exists employee CASCADE;

CREATE TABLE employee (
  employee_id INT NOT NULL COMMENT '社員ID'
  , fimily_namea VARCHAR(10) NOT NULL COMMENT '社員名（姓）'
  , first_name VARCHAR(10) NOT NULL COMMENT '社員名（名）'
  , fimily_name_kana VARCHAR(10) NOT NULL COMMENT '社員名カナ（姓）'
  , first_name_kana VARCHAR(10) NOT NULL COMMENT '社員名カナ（姓）'
  , gender VARCHAR(1) NOT NULL COMMENT '性別'
  , CONSTRAINT employee_PKC PRIMARY KEY (employee_id)
) COMMENT '社員' ;

