package com.example.demo.controller;

import com.example.demo.controller.exception.EntityNotFoundException;
import com.example.demo.entity.Candidate;
import com.example.demo.entity.Election;
import com.example.demo.entity.Topic;
import com.example.demo.model.request.election.ElectionRequest;
import com.example.demo.model.response.Response;
import com.example.demo.model.response.election.ElectionResponse;
import com.example.demo.model.response.election.ElectionResult;
import com.example.demo.service.CandidateService;
import com.example.demo.service.ElectionService;
import com.example.demo.service.TopicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


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


    @GetMapping("/topic/{id}/election")
    public Response<List<ElectionResponse>> findAll(@PathVariable Integer id) {
        List<Election> elections = electionService.findAll(id);

        List<ElectionResponse> response = new ArrayList<>();

        for (Election election : elections) {
            response.add(new ElectionResponse(
                    election.getId(),
                    election.getElector(),
                    election.getCandidate().getId(),
                    election.getTopic().getId(),
                    election.getElectionDate()
            ));
        }

        return Response.success(response);
    }


    @GetMapping("/topic/{id}/result")
    public Response<List<ElectionResult>> resultVote(@PathVariable Integer id) {
        List<Election> elections = electionService.result(id);

        List<ElectionResult> response = new ArrayList<>();

        for (Election election : elections) {
            response.add(new ElectionResult(
                    election.getId(),
                    election.getCandidate().getName(),
                    electionService.countVote(election.getTopic().getId(), election.getCandidate().getId())
            ));
        }

        return Response.success(response);
    }


    @PostMapping("/topic/{id}/election")
    public Response<ElectionResponse> add(@PathVariable Integer id, @RequestBody @Valid ElectionRequest request) {
        Election election = modelMapper.map(request, Election.class);

        Candidate candidate = candidateService.find(request.getCandidateId());
        if (candidate == null) throw new EntityNotFoundException();

        Topic topic = topicService.findById(request.getTopicId());
        if (topic == null) throw new EntityNotFoundException();

        election.setCandidate(candidate);
        election.setTopic(topic);

        election = electionService.save(election);

        ElectionResponse response = new ElectionResponse(
                election.getId(),
                election.getElector(),
                election.getCandidate().getId(),
                election.getTopic().getId(),
                election.getElectionDate()
        );

        return Response.success(response);
    }
}