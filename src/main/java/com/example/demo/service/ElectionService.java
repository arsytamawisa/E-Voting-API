package com.example.demo.service;

import com.example.demo.entity.Election;
import com.example.demo.model.response.election.ElectionResultResponse;
import com.example.demo.repository.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionService extends AbstractService<Election, Integer> {

    @Autowired
    protected ElectionService(ElectionRepository repository) {
        super(repository);
    }

    @Autowired
    protected ElectionRepository electionRepository;

    public List<ElectionResultResponse> result(Integer topicId) {
        return electionRepository.result(topicId);
    }
}
