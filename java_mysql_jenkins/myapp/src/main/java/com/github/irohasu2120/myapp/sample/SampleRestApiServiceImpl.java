package com.github.irohasu2120.myapp.sample;

import com.github.irohasu2120.myapp.domain.SampleT;
import com.github.irohasu2120.myapp.sample.dto.Person;
import com.github.irohasu2120.myapp.sample.repository.SampleCustomRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class SampleRestApiServiceImpl implements SampleRestApiService {

    @Autowired
    private SampleCustomRepository sampleCustomRepository;

    /** {@inheritDoc}  */
    @Override
    public Person doProcess(String id) {
        Optional<SampleT> op_sample_t = sampleCustomRepository.findById(Integer.parseInt(id));
        log.debug(op_sample_t);
        log.info("ログ出力サンプル");

        if (op_sample_t.isPresent()) {
            SampleT sample_t = op_sample_t.get();
            return new Person(String.valueOf(sample_t.getSampleId()), sample_t.getSampleName());
        } else {
            return new Person(id, "データ無し君");
        }
    }
}
