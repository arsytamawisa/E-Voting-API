package com.example.demo.repository;

import com.example.demo.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    @Query(value = "SELECT * FROM candidate WHERE topic_id = :topicId", nativeQuery = true)
    List<Candidate> getAll(@Param("topicId") Integer topicId);


    @Query(value = "SELECT * FROM candidate WHERE id = :id", nativeQuery = true)
    Candidate find(@Param("id") Integer id);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM candidate WHERE id = :id", nativeQuery = true)
    Integer delete(@Param("id") Integer candidateId);
}