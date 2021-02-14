package com.example.demo.service;

import com.example.demo.entity.Topic;
import com.example.demo.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService extends AbstractService<Topic, Integer> {

    @Autowired
    protected TopicService(TopicRepository repository) {
        super(repository);
    }

    @Autowired
    protected TopicRepository topicRepository;

//    public Topic findById(String id) {
//       return topicRepository.findById(id);
//    }
}