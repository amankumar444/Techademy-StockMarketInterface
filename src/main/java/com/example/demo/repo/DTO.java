package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entities;

@Repository
public interface DTO extends JpaRepository<entities, String> {

}
