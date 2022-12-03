DROP TABLE IF EXISTS employee CASCADE;

CREATE TABLE employee (
  employee_id INT NOT NULL COMMENT '社員ID'
  , family_name VARCHAR(10) NOT NULL COMMENT '社員名（姓）'
  , first_name VARCHAR(10) NOT NULL COMMENT '社員名（名）'
  , family_name_kana VARCHAR(10) NOT NULL COMMENT '社員名カナ（姓）'
  , first_name_kana VARCHAR(10) NOT NULL COMMENT '社員名カナ（姓）'
  , gender VARCHAR(1) NOT NULL COMMENT '性別'
  , CONSTRAINT employee_PKC PRIMARY KEY (employee_id)
) COMMENT '社員' ;

