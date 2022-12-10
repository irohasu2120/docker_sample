package com.github.irohasu2120.myapp.sample;

import com.github.irohasu2120.myapp.sample.dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleRestApiServiceImplTest {

    @Autowired
    SampleRestApiServe sampleRestApiServe;

    @Nested
    class Success {
        @ParameterizedTest
        @CsvSource({"1, Tanaka", "100, Yamada"})
        void doProcess(String id, String name) {
            Assertions.assertEquals(sampleRestApiServe.doProcess(id), new Person(id, name));
        }
    }
}
