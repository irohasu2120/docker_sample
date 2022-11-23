package jp.irohasu2120.myapp.sample;

import jp.irohasu2120.myapp.sample.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestApiController {

    // サンプルサービス
    @Autowired
    private SampleRestApiServe sampleRestApiServe;

    /**
     * Getリクエストサンプル
     * <br>エンドポイントにパラメタを含める場合の書き方サンプル
     * @param id id
     * @return Person
     */
    @GetMapping("/sample/get-persons/{id}")
    public Person doGet(@PathVariable("id") String id) {
        return sampleRestApiServe.doProcess(id);
    }
}
