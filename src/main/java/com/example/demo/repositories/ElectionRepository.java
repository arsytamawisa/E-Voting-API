package com.example.demo.repositories;

import com.example.demo.entities.Election;
import com.example.demo.entities.Topic;
import com.example.demo.models.response.election.ElectionResultResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface ElectionRepository extends JpaRepository<Election, Integer> {

    @Query(value = "SELECT candidate.id, candidate.name, COUNT(candidate_id) total_vote FROM election JOIN candidate ON candidate.id = election.candidate_id JOIN topic ON candidate.topic_id = topic.id WHERE topic.id = :topicId GROUP BY candidate_id", nativeQuery = true)
    List<ElectionResultResponse> result(@Param("topicId") Integer topicId);
}