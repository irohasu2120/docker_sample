package com.github.irohasu2120.myapp.sample;

import com.github.irohasu2120.myapp.domain.Sample_T;
import com.github.irohasu2120.myapp.sample.dto.Person;
import com.github.irohasu2120.myapp.sample.repository.SampleCustomRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class SampleRestApiServiceImpl implements SampleRestApiServe {

    @Autowired
    private SampleCustomRepository sampleCustomRepository;

    /** {@inheritDoc}  */
    @Override
    public Person doProcess(String id) {
        Sample_T sample_t = sampleCustomRepository.findById(Integer.parseInt(id));
        log.info("ログ出てるね");
        if (sample_t != null) {
            return new Person(String.valueOf(sample_t.getSampleId()), sample_t.getSampleName());
        } else {
            return new Person(id, "データ無し君");
        }
    }
}
