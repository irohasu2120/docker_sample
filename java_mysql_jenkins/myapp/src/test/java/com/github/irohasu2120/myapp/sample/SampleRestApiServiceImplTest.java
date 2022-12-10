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
        @CsvSource({"1, サンプル君", "100, データ無し君"})
        void doProcess(String id, String name) {
            Assertions.assertEquals(new Person(id, name), sampleRestApiServe.doProcess(id));
        }
    }
}
