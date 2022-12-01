package com.github.irohasu2120.myapp.sample;

import com.github.irohasu2120.myapp.sample.dto.Person;

/**
 * サンプルService
 */
public interface SampleRestApiServe {
    /**
     * サンプルメソッド
     * @param id id
     * @return Persion
     */
    public Person doProcess(String id);
}