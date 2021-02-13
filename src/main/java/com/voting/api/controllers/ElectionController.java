package com.example.demo.controllers;

import com.example.demo.controllers.exceptions.EntityNotFoundException;
import com.example.demo.entities.Election;
import com.example.demo.models.request.election.ElectionRequest;
import com.example.demo.models.response.Response;
import com.example.demo.models.response.election.ElectionResponse;
import com.example.demo.services.ElectionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RequestMapping("/election/topic/{id}")
@RestController
public class ElectionController {

    @Autowired
    protected ElectionService electionService;

    @Autowired
    protected ModelMapper modelMapper;


    @GetMapping
    public Response<List<Election>> findAll() {
        List<Election> elections = electionService.findAll();
        return Response.success(elections);
    }


    @PostMapping
    public Response<ElectionResponse> add(@RequestBody @Valid ElectionRequest request) {
        Election election           = modelMapper.map(request, Election.class);
        election                    = electionService.save(election);
        ElectionResponse response   = modelMapper.map(election, ElectionResponse.class);
        return Response.success(response);
    }
}