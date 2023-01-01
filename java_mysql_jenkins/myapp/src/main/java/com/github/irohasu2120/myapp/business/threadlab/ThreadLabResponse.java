package com.github.irohasu2120.myapp.business.threadlab;

import com.github.irohasu2120.myapp.business.threadlab.service.dto.JsonPlaceHolderDto;
import com.github.irohasu2120.myapp.common.base.BaseRestResponse;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class ThreadLabResponse extends BaseRestResponse {
    private String id;
    private JsonPlaceHolderDto dto1;
    private JsonPlaceHolderDto dto2;
    private JsonPlaceHolderDto dto3;
}
