package com.example.demo.services;

import com.example.demo.entities.Topic;
import com.example.demo.repositories.TopicRepository;
import com.example.demo.services.blueprint.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TopicService extends AbstractService<Topic, Integer> {

    @Autowired
    protected TopicService(TopicRepository repository) {
        super(repository);
    }

    @Autowired
    protected TopicRepository topicRepository;

    public List<Topic> getAll() {
       return topicRepository.getAll();
    }
}