package com.example.demo.controllers;

import com.example.demo.entities.Candidate;
import com.example.demo.entities.Election;
import com.example.demo.entities.Topic;
import com.example.demo.models.request.election.ElectionRequest;
import com.example.demo.models.response.Response;
import com.example.demo.models.response.election.ElectionResponse;
import com.example.demo.models.response.election.ElectionResultResponse;
import com.example.demo.services.CandidateService;
import com.example.demo.services.ElectionService;
import com.example.demo.services.TopicService;
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
        Candidate candidate         = candidateService.findById(topicId, request.getCandidateId());
        election.setCandidate(candidate);
        election                    = electionService.save(election);
        System.out.println(election);
        ElectionResponse response   = modelMapper.map(election, ElectionResponse.class);

        return Response.success(response);
    }
}