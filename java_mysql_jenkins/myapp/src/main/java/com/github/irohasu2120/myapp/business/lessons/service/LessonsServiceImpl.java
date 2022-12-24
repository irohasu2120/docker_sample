package com.github.irohasu2120.myapp.business.lessons.service;

import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsRepositoryOutDto;
import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceInDto;
import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceOutDto;
import com.github.irohasu2120.myapp.domain.Lesson;
import com.github.irohasu2120.myapp.repository.single.LessonDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Service
@RequiredArgsConstructor
public class LessonsServiceImpl implements LessonsService {

    @Autowired
    private final LessonDao lessonDao;

    @Override
    public LessonsServiceOutDto getLessons(LessonsServiceInDto inDto) {
        var mapper = new ModelMapper();
        var outDto = new LessonsServiceOutDto();

        List<Lesson> lessonEntities = findLessons();
        List<LessonsRepositoryOutDto> lessonsRepositoryOutDtos = lessonEntities
                .stream()
                .map(lesson -> mapper.map(lesson, LessonsRepositoryOutDto.class))
                .collect(Collectors.toList());

        outDto.setLessons(lessonsRepositoryOutDtos);
        return outDto;
    }

    private List<Lesson> findLessons() {
        return lessonDao.findLessons();
    }
}
