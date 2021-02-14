package com.example.demo.controller;

import com.example.demo.controller.exception.EntityNotFoundException;
import com.example.demo.entity.Candidate;
import com.example.demo.entity.Topic;
import com.example.demo.model.request.candidate.CandidateRequest;
import com.example.demo.model.response.Response;
import com.example.demo.service.CandidateService;
import com.example.demo.service.TopicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class CandidateController {

    @Autowired
    protected CandidateService candidateService;

    @Autowired
    protected TopicService topicService;

    @Autowired
    protected ModelMapper modelMapper;


    @GetMapping("/topic/{id}/candidate")
    public Response<List<Candidate>> findAll(@PathVariable Integer id) {
        List<Candidate> candidates = candidateService.getAll(id);
        if (candidates == null) throw new EntityNotFoundException();
        return Response.success(candidates);
    }


    @PostMapping("/candidate")
    public Response<Candidate> add(@RequestBody @Valid CandidateRequest request) {
        Candidate candidate          = modelMapper.map(request, Candidate.class);
        Topic topic                  = topicService.findById(request.getTopicId());
        candidate.setTopic(topic);
        candidate                    = candidateService.save(candidate);
        return Response.success(candidate);
    }


    @GetMapping("candidate/{id}")
    public Response<Candidate> findById(@PathVariable Integer id) {
        Candidate candidate = candidateService.find(id);
        if (candidate == null) throw new EntityNotFoundException();
        return Response.success(candidate);
    }


    @DeleteMapping("candidate/{id}")
    public Response<Candidate> removeById(@PathVariable Integer id) {
        Candidate candidate = candidateService.delete(id);
        if (candidate == null) throw new EntityNotFoundException();
        return Response.success(candidate);
    }


    @PutMapping("candidate/{id}")
    public Response<Candidate> edit(@PathVariable Integer id, @RequestBody @Valid CandidateRequest request) {
        Candidate candidate = candidateService.find(id);
        if (candidate == null) throw new EntityNotFoundException();
        modelMapper.map(request, candidate);
        candidate = candidateService.save(candidate);
        return Response.success(candidate);
    }
}
