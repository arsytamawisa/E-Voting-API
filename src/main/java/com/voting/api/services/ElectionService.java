package com.example.demo.services;

import com.example.demo.entities.Election;
import com.example.demo.repositories.ElectionRepository;
import com.example.demo.services.blueprint.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectionService extends AbstractService<Election, Integer> {

    @Autowired
    protected ElectionService(ElectionRepository repository) {
        super(repository);
    }
}
