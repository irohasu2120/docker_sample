package com.github.irohasu2120.myapp.sample;

import com.github.irohasu2120.myapp.domain.Sample_T;
import com.github.irohasu2120.myapp.sample.dto.Person;
import com.github.irohasu2120.myapp.sample.repository.SampleCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleRestApiServiceImpl implements SampleRestApiServe {

    @Autowired
    private SampleCustomRepository sampleCustomRepository;

    /** {@inheritDoc}  */
    @Override
    public Person doProcess(String id) {
        Sample_T sample_t = sampleCustomRepository.findById(Integer.parseInt(id));

        if (sample_t != null) {
            return new Person(String.valueOf(sample_t.getSampleId()), sample_t.getSampleName());
        } else {
            return new Person("999", "データ無し君");
        }
    }
}
