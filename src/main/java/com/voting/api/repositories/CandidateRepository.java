package com.example.demo.repositories;

import com.example.demo.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    @Query(value = "SELECT * FROM candidate WHERE topic_id = :topicId", nativeQuery = true)
    List<Candidate> findAll(@Param("topicId") Integer topicId);


    @Query(value = "SELECT * FROM candidate WHERE topic_id = :topicId && id = :candidateId", nativeQuery = true)
    Candidate findById(@Param("topicId") Integer topicId, @Param("candidateId") Integer candidateId);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM candidate WHERE topic_id = :topicId && id = :candidateId", nativeQuery = true)
    Integer removeById(@Param("topicId") Integer topicId, @Param("candidateId") Integer candidateId);
}