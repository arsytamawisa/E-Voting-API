package com.example.demo.controller;

import com.example.demo.controller.exception.EntityNotFoundException;
import com.example.demo.entity.Topic;
import com.example.demo.model.request.topic.TopicRequest;
import com.example.demo.model.response.Response;
import com.example.demo.model.response.topic.TopicResponse;
import com.example.demo.service.TopicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping("/topic")
@RestController
public class TopicController {

    @Autowired
    protected TopicService topicService;

    @Autowired
    protected ModelMapper modelMapper;


    @GetMapping
    public Response<List<Topic>> findAll() {
        List<Topic> topics = topicService.findAll();
        if (topics == null) throw new EntityNotFoundException();
        return Response.success(topics);
    }


    @GetMapping("/{id}")
    public Response<Topic> findById(@PathVariable Integer id) {
        Topic topic = topicService.findById(id);
        if (topic == null) throw new EntityNotFoundException();
        return Response.success(topic);
    }


    @PostMapping
    public Response<TopicResponse> add(@RequestBody @Valid TopicRequest request) {
        System.out.println(request);
        Topic topic              = modelMapper.map(request, Topic.class);
        topic                    = topicService.save(topic);
        TopicResponse response   = modelMapper.map(topic, TopicResponse.class);
        return Response.success(response);
    }


    @DeleteMapping("/{id}")
    public Response delete(@PathVariable Integer id) {
        Topic topic = topicService.removeById(id);
        if (topic == null) throw new EntityNotFoundException();
        return Response.success(topic);
    }


    @PutMapping("/{id}")
    public Response<Topic> edit(@PathVariable Integer id, @RequestBody @Valid TopicRequest request) {
        Topic topic = topicService.findById(id);
        if (topic == null) throw new EntityNotFoundException();

        modelMapper.map(request, topic);
        topic = topicService.save(topic);
        return Response.success(topic);
    }
}
