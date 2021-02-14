package com.example.demo.controller;

import com.example.demo.entity.Candidate;
import com.example.demo.entity.Election;
import com.example.demo.model.request.election.ElectionRequest;
import com.example.demo.model.response.Response;
import com.example.demo.model.response.election.ElectionResponse;
import com.example.demo.model.response.election.ElectionResultResponse;
import com.example.demo.service.CandidateService;
import com.example.demo.service.ElectionService;
import com.example.demo.service.TopicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RequestMapping("/election/topic/{topicId}")
@RestController
public class ElectionController {

    @Autowired
    protected ElectionService electionService;

    @Autowired
    protected CandidateService candidateService;

    @Autowired
    protected TopicService topicService;

    @Autowired
    protected ModelMapper modelMapper;


    @GetMapping
    public Response<List<Election>> findAll() {
        List<Election> elections = electionService.findAll();
        return Response.success(elections);
    }


    @GetMapping("/result")
    public Response<List<ElectionResultResponse>> result(@PathVariable Integer topicId) {
        List<ElectionResultResponse> elections = electionService.result(topicId);
        return Response.success(elections);
    }


    @PostMapping
    public Response<ElectionResponse> add(@PathVariable Integer topicId, @RequestBody @Valid ElectionRequest request) {
        Election election           = modelMapper.map(request, Election.class);
        Candidate candidate         = candidateService.find(request.getCandidateId());
        election.setCandidate(candidate);
        election                    = electionService.save(election);
        ElectionResponse response   = modelMapper.map(election, ElectionResponse.class);
        return Response.success(response);
    }
}