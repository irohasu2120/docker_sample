package com.github.irohasu2120.myapp.sample.repository;

import com.github.irohasu2120.myapp.domain.Sample_T;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleCustomRepository {
    Sample_T findById(int sampleId);
}
