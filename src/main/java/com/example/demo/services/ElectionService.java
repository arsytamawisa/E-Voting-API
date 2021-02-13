package com.example.demo.services;

import com.example.demo.entities.Election;
import com.example.demo.entities.Topic;
import com.example.demo.models.response.election.ElectionResultResponse;
import com.example.demo.repositories.ElectionRepository;
import com.example.demo.repositories.TopicRepository;
import com.example.demo.services.blueprint.AbstractService;
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
