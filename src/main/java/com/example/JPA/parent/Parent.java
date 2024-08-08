package com.example.JPA.parent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Parent {

    @Id
    private String id;
    private String name;


    public Parent(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
