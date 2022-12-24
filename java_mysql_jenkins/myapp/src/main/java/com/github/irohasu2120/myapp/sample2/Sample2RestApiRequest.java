package com.github.irohasu2120.myapp.sample2;

import com.github.irohasu2120.myapp.common.base.BaseRestRequest;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Sample2RestApiRequest extends BaseRestRequest {
    private Sample2RestApiInnerRequest req;
}
