package com.example.demo.services;

import com.example.demo.entities.Candidate;
import com.example.demo.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    protected CandidateRepository candidateRepository;
    protected final JpaRepository<Candidate, Integer> repository;
    protected CandidateService(JpaRepository<Candidate, Integer> repository) {
        this.repository = repository;
    }


    /* SERVICES */

    public List<Candidate> findAll(Integer topicId) {
        return candidateRepository.findAll(topicId);
    }

    public Candidate findById(Integer topicId, Integer candidateId) {
        return candidateRepository.findById(topicId, candidateId);
    }

    public Candidate removeById(Integer topicId, Integer candidateId) {
        Candidate candidate = candidateRepository.findById(topicId, candidateId);
        Integer id = candidateRepository.removeById(topicId, candidateId);
        if (id == 0) return null;
        return candidate;
    }

    public Candidate save(Candidate candidate) {
        return repository.save(candidate);
    }
}