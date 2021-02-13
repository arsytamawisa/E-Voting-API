package com.example.demo.repositories;

import com.example.demo.entities.Election;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ElectionRepository extends JpaRepository<Election, Integer> {}