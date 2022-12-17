package com.github.irohasu2120.myapp.sample.repository;

import com.github.irohasu2120.myapp.domain.SampleT;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface SampleCustomRepository {
    Optional<SampleT> findById(int sampleId);
}
