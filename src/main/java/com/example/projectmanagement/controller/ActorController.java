package com.example.projectmanagement.controller;

import com.example.projectmanagement.entity.Actor;
import com.example.projectmanagement.repository.ActorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {

    private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping("/actors")
    public List<Actor> getActors() {
        return actorRepository.findAll();
    }
}
