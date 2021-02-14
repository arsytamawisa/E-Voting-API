package com.example.demo.service;

import com.example.demo.entity.Candidate;
import com.example.demo.repository.CandidateRepository;
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

    public List<Candidate> getAll(Integer topicId) {
        return candidateRepository.getAll(topicId);
    }

    public Candidate find(Integer id) {
        return candidateRepository.find(id);
    }

    public Candidate delete(Integer id) {
        Candidate candidate = candidateRepository.find(id);
        Integer status = candidateRepository.delete(id);
        if (status == 0) return null;
        return candidate;
    }

    public Candidate save(Candidate candidate) {
        return repository.save(candidate);
    }
}