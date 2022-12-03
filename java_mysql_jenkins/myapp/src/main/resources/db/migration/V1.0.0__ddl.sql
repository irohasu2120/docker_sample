-- Project Name : SampleDB
-- Date/Time    : 2022/12/03 19:53:48
-- Author       : halo1
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- サンプル
drop table if exists sample_t cascade;

create table sample_t (
  sample_id BIGINT not null comment 'サンプルID'
  , sample_name VARCHAR(20) comment 'サンプル名'
  , sample_date DATE comment 'サンプル日'
  , sample_datetime DATETIME comment 'サンプル日時'
  , create_name VARCHAR(20) comment '登録者'
  , create_datetime DATETIME comment '登録日時'
  , update_name VARCHAR(20) comment '更新者'
  , update_datetime DATETIME comment '更新日時'
  , delete_flag VARCHAR(1) comment '削除フラグ'
  , constraint sample_t_PKC primary key (sample_id)
) comment 'サンプル' ;

-- 授業
drop table if exists lesson cascade;

create table lesson (
  lesson_id BIGINT not null comment '授業ID'
  , lesson_name VARCHAR(20) not null comment '授業名'
  , open_date DATE not null comment '公開開始日'
  , close_date DATE not null comment '公開終了日'
  , create_name VARCHAR(20) comment '登録者'
  , create_datetime DATETIME comment '登録日時'
  , update_name VARCHAR(20) comment '更新者'
  , update_datetime DATETIME comment '更新日時'
  , delete_flag VARCHAR(1) comment '削除フラグ'
  , constraint lesson_PKC primary key (lesson_id)
) comment '授業' ;

-- 学生
drop table if exists student cascade;

create table student (
  student_id BIGINT not null comment '学生ID'
  , famaily_name VARCHAR(15) not null comment '姓'
  , first_name VARCHAR(15) not null comment '名'
  , famaily_name_kana VARCHAR(15) not null comment '姓カナ'
  , first_name_kana VARCHAR(15) not null comment '名カナ'
  , gender VARCHAR(1) not null comment '性別'
  , gender_memo VARCHAR(20) comment '性別備考'
  , birth_day DATE not null comment '誕生日'
  , create_name VARCHAR(20) comment '登録者'
  , create_datetime DATETIME comment '登録日時'
  , update_name VARCHAR(20) comment '更新者'
  , update_datetime DATETIME comment '更新日時'
  , delete_flag VARCHAR(1) comment '削除フラグ'
  , constraint student_PKC primary key (student_id)
) comment '学生' ;

-- 予約
drop table if exists reserve cascade;

create table reserve (
  reserve_id BIGINT not null comment '予約ID'
  , lesson_id BIGINT not null comment '授業ID'
  , student_id BIGINT not null comment '学生ID'
  , status VARCHAR(1) not null comment '予約ステータス'
  , create_name VARCHAR(20) comment '登録者'
  , create_datetime DATETIME comment '登録日時'
  , update_name VARCHAR(20) comment '更新者'
  , update_datetime DATETIME comment '更新日時'
  , delete_flag VARCHAR(1) comment '削除フラグ'
  , constraint reserve_PKC primary key (reserve_id,lesson_id,student_id)
) comment '予約' ;


