package com.example.demo.repository;

import com.example.demo.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicRepository extends JpaRepository<Topic, Integer> {

//    @Query(value = "SELECT * FROM topic WHERE id = :id", nativeQuery = true)
//    Topic findById(@Param("id") String id);
}