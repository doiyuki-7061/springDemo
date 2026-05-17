package com.example.projectmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "actor")
@Data
public class Actor {

    @Id
    @Column(name = "actor_id")
    private Integer actorId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
