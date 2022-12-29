package com.github.irohasu2120.myapp.business.lessons;


import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsRepositoryOutDto;
import com.github.irohasu2120.myapp.common.base.BaseRestResponse;
import lombok.Data;

import java.util.List;

@Data
public class LessonsResponse extends BaseRestResponse {
    /** 授業一覧 */
    private List<LessonsRepositoryOutDto> lessons;
}
