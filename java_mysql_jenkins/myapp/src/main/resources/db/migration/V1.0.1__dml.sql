INSERT INTO sampledb.sample_t(sample_id,sample_name,sample_date,sample_datetime,create_name,create_datetime,update_name,update_datetime,delete_flag) VALUES
    (1,'サンプル君',DATE '2022-12-03',TIMESTAMP '2022-12-03 20:33:54.495','SYSTEM',TIMESTAMP '2022-12-01 20:34:07.324','UPDATE_SYSTEM',TIMESTAMP '2022-12-02 20:34:26.082','0');

INSERT INTO sampledb.lesson(lesson_id,lesson_name,open_date,close_date,create_name,create_datetime,update_name,update_datetime,delete_flag) VALUES
    (1,'現代文',DATE '2022-12-25',DATE '9999-12-31','SYSTEM',TIMESTAMP '2022-12-25 05:25:28.183','SYSTEM',TIMESTAMP '2022-12-25 05:25:33.991','0')
  , (2,'数学',DATE '2022-12-25',DATE '9999-12-31','SYSTEM',TIMESTAMP '2022-12-25 05:26:01.353','SYSTEM',TIMESTAMP '2022-12-25 05:26:06.612','0')
  , (3,'英語',DATE '2022-12-25',DATE '9999-12-31','SYSTEM',TIMESTAMP '2022-12-25 05:26:37.245','SYSTEM',TIMESTAMP '2022-12-25 05:26:43.731','0');
