package com.example.demo.repositories;

import com.example.demo.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


public interface TopicRepository extends JpaRepository<Topic, Integer> {

    @Query(value = "SELECT * FROM topic", nativeQuery = true)
    List<Topic> getAll();
}