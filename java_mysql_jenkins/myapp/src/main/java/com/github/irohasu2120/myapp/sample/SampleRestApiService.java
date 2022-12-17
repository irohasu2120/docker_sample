package com.github.irohasu2120.myapp.sample;

import com.github.irohasu2120.myapp.sample.dto.Person;

/**
 * サンプルService
 */
public interface SampleRestApiService {
    /**
     * サンプルメソッド
     * @param id id
     * @return Persion
     */
    Person doProcess(String id);
}
