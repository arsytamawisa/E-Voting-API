package com.example.demo.repository;

import com.example.demo.entity.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ElectionRepository extends JpaRepository<Election, Integer> {

    @Query(value = "SELECT election.id, election.candidate_id, " +
            "election.topic_id, elector, election_date " +
            "FROM election " +
            "JOIN candidate ON candidate.id = election.candidate_id " +
            "JOIN topic ON candidate.topic_id = topic.id " +
            "WHERE topic.id = :id " +
            "GROUP BY candidate_id", nativeQuery = true)
    List<Election> result(@Param("id") Integer id);


    @Query(value = "SELECT COUNT(election.candidate_id) FROM election " +
            "JOIN candidate ON candidate.id = election.candidate_id " +
            "JOIN topic ON candidate.topic_id = topic.id " +
            "WHERE topic.id = :topicId " +
            "AND election.candidate_id = :candidateId " +
            "GROUP BY candidate_id", nativeQuery = true)
    Integer countVote(@Param("topicId") Integer topicId, @Param("candidateId") Integer candidateId);


    @Query(value = "SELECT * FROM election WHERE topic_id = :id", nativeQuery = true)
    List<Election> findAll(@Param("id") Integer id);
}