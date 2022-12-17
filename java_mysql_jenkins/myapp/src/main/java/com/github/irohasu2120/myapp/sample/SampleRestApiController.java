package com.github.irohasu2120.myapp.sample;

import com.github.irohasu2120.myapp.BaseRestApiController;
import com.github.irohasu2120.myapp.common.base.BaseRestResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestApiController extends BaseRestApiController {

    // サンプルサービス
    @Autowired
    private SampleRestApiService sampleRestApiService;

    /**
     * Getリクエストサンプル
     * <br>エンドポイントにパラメタを含める場合の書き方サンプル
     * @param id id
     * @return Person
     */
    @GetMapping("/sample/get-persons/{id}")
    @ApiOperation(value = "APIの概要を記載。", notes = "より詳細なAPIの説明を記載。")
    public BaseRestResponse doGet(@PathVariable("id") @ApiParam("個人ID") String id) {
        var response = new SampleRestApiResponse();
        var innerResponse = new SampleRestApiInnerResponse();

        innerResponse.setPerson(sampleRestApiService.doProcess(id));
        response.setResponse(innerResponse);

        return response;
    }
}
