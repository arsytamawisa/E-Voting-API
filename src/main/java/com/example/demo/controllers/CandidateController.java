package com.example.demo.controllers;

import com.example.demo.controllers.exceptions.EntityNotFoundException;
import com.example.demo.entities.Candidate;
import com.example.demo.entities.Topic;
import com.example.demo.models.request.candidate.CandidateRequest;
import com.example.demo.models.response.Response;
import com.example.demo.models.response.candidate.CandidateResponse;
import com.example.demo.services.CandidateService;
import com.example.demo.services.TopicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping("/topic/{topicId}/candidate")
@RestController
public class CandidateController {

    @Autowired
    protected CandidateService candidateService;

    @Autowired
    protected TopicService topicService;

    @Autowired
    protected ModelMapper modelMapper;


    @GetMapping
    public Response<List<Candidate>> findAll(@PathVariable Integer topicId) {
        List<Candidate> candidates = candidateService.findAll(topicId);
        if (candidates == null) throw new EntityNotFoundException();
        return Response.success(candidates);
    }


    @PostMapping
    public Response<CandidateResponse> add(@RequestBody @Valid CandidateRequest request) {
        Candidate candidate          = modelMapper.map(request, Candidate.class);

        Topic topic                  = topicService.findById(request.getTopicId());
        candidate.setTopic(topic);
        candidate                    = candidateService.save(candidate);

        System.out.println(candidate);
        CandidateResponse response   = modelMapper.map(candidate, CandidateResponse.class);
        System.out.println(response);
        return Response.success(response);
    }


    @GetMapping("/{candidateId}")
    public Response<Candidate> findById(@PathVariable Integer topicId, @PathVariable Integer candidateId) {
        Candidate candidate = candidateService.findById(topicId, candidateId);
        if (candidate == null) throw new EntityNotFoundException();
        return Response.success(candidate);
    }


    @DeleteMapping("/{candidateId}")
    public Response<Candidate> removeById(@PathVariable Integer topicId, @PathVariable Integer candidateId) {
        Candidate candidate = candidateService.removeById(topicId, candidateId);
        if (candidate == null) throw new EntityNotFoundException();
        return Response.success(candidate);
    }


    @PutMapping("/{candidateId}")
    public Response<Candidate> edit(@PathVariable Integer topicId, @PathVariable Integer candidateId) {
        Candidate candidate = candidateService.removeById(topicId, candidateId);
        if (candidate == null) throw new EntityNotFoundException();
        return Response.success(candidate);
    }
}
