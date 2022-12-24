package com.github.irohasu2120.myapp.repository.single;

import com.github.irohasu2120.myapp.domain.Lesson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LessonDao {
    @Select("SELECT * FROM lesson WHERE delete_flag = '0'")
    List<Lesson> findLessons();
}
