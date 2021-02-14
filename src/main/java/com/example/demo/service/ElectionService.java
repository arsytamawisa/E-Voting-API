package com.example.demo.service;

import com.example.demo.entity.Election;
import com.example.demo.repository.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class ElectionService extends AbstractService<Election, Integer> {

    @Autowired
    protected ElectionService(ElectionRepository repository) {
        super(repository);
    }

    @Autowired
    protected ElectionRepository electionRepository;

    public List<Election> result(Integer topicId) {
        return electionRepository.result(topicId);
    }

    public List<Election> findAll(Integer id) {
        return electionRepository.findAll(id);
    }

    public Integer countVote(Integer topicId, Integer candidateId) {
        return electionRepository.countVote(topicId, candidateId);
    }
}
