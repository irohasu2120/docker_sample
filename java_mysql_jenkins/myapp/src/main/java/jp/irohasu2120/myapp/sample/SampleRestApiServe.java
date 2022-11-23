package jp.irohasu2120.myapp.sample;

import jp.irohasu2120.myapp.sample.dto.Person;

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
