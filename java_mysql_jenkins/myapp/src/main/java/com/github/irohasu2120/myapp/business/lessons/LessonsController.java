package com.github.irohasu2120.myapp.business.lessons;

import com.github.irohasu2120.myapp.business.lessons.service.LessonsService;
import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceInDto;
import com.github.irohasu2120.myapp.business.lessons.service.dto.LessonsServiceOutDto;
import com.github.irohasu2120.myapp.common.base.BaseRestApiController;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class LessonsController extends BaseRestApiController {

    @Autowired
    private final LessonsService lessonsService;

    @Autowired
    private final ModelMapper mapper;

    @GetMapping("/lessons")
    @ApiOperation(value = "授業一覧取得", notes = "授業の一覧情報を取得")
    @ResponseBody
    public LessonsResponse getLessons() {
        var response = new LessonsResponse();
        var inDto = new LessonsServiceInDto();

        LessonsServiceOutDto outDto = lessonsService.getLessons(inDto);
        mapper.map(outDto, response);

        return response;
    }
}
