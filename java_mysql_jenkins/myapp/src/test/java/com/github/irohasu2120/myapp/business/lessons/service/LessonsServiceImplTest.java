package com.github.irohasu2120.myapp.business.lessons.service;

import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsRepositoryOutDto;
import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceInDto;
import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceOutDto;
import com.github.irohasu2120.myapp.domain.Lesson;
import com.github.irohasu2120.myapp.repository.single.LessonDao;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LessonsServiceImplTest {

    @InjectMocks
    private LessonsServiceImpl lessonsService;

    @Mock
    private LessonDao lessonDao;

    private AutoCloseable closeable;

    private final LocalDateTime testDateTime = LocalDateTime.of(2022, 12, 18, 12, 34, 56, 123);

    class Base {
        @BeforeEach
        void startService() {
            closeable = MockitoAnnotations.openMocks(this);
        }

        @AfterEach
        void closeService() throws Exception {
            closeable.close();
        }
    }

    @Nested
    class Success extends Base {
        @Test
        @DisplayName("1件取得")
        void getLesson() {
            var lesson = new Lesson(1, "テスト授業", testDateTime, testDateTime);
            List<Lesson> lessons = List.of(lesson);
            when(lessonDao.findLessons()).thenReturn(lessons);

            var expected = new LessonsServiceOutDto();
            expected.setLessons(List.of(new LessonsRepositoryOutDto(1, "テスト授業")));

            var lessonsServiceInDto = new LessonsServiceInDto();
            LessonsServiceOutDto actual = lessonsService.getLessons(lessonsServiceInDto);

            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("複数件取得")
        void getLessons() {
            var lesson = new Lesson(1, "テスト授業", testDateTime, testDateTime);
            var lesson2 = new Lesson(2, "テスト授業2", testDateTime, testDateTime);
            var lesson3 = new Lesson(3, "テスト授業3", testDateTime, testDateTime);
            List<Lesson> lessons = List.of(lesson, lesson2, lesson3);
            when(lessonDao.findLessons()).thenReturn(lessons);

            var expected = new LessonsServiceOutDto();
            expected.setLessons(List.of(
                new LessonsRepositoryOutDto(1, "テスト授業"),
                new LessonsRepositoryOutDto(2, "テスト授業2"),
                new LessonsRepositoryOutDto(3, "テスト授業3")
            ));

            var lessonsServiceInDto = new LessonsServiceInDto();
            LessonsServiceOutDto actual = lessonsService.getLessons(lessonsServiceInDto);

            assertEquals(expected, actual);
        }
    }
}
