package jp.irohasu2120.myapp.sample;

import jp.irohasu2120.myapp.sample.dto.Person;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class SampleRestApiServiceImpl implements SampleRestApiServe {

    /** {@inheritDoc}  */
    @Override
    public Person doProcess(String id) {
        if (StringUtils.isNotEmpty(id) && "1".equals(id)) {
            return new Person("1", "Tanaka");
        } else {
            return new Person("100", "Yamada");
        }
    }
}
