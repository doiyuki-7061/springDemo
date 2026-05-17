package com.example.projectmanagement.repository;

import com.example.projectmanagement.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}