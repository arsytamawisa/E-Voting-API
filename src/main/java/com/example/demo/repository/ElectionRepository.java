package com.example.demo.repository;

import com.example.demo.entity.Election;
import com.example.demo.model.response.election.ElectionResultResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ElectionRepository extends JpaRepository<Election, Integer> {

    @Query(value = "SELECT candidate.id, candidate.name, COUNT(candidate_id) total_vote FROM election JOIN candidate ON candidate.id = election.candidate_id JOIN topic ON candidate.topic_id = topic.id WHERE topic.id = :topicId GROUP BY candidate_id", nativeQuery = true)
    List<ElectionResultResponse> result(@Param("topicId") Integer topicId);
}