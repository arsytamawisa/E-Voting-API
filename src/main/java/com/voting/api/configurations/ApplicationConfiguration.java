package com.example.demo.configurations;

import com.example.demo.entities.Candidate;
import com.example.demo.models.request.candidate.CandidateRequest;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

//        modelMapper.typeMap(CandidateRequest.class, Candidate.class)
//                .addMappings(mapper -> mapper.skip(Candidate::setId));

        return modelMapper;
    }
}
