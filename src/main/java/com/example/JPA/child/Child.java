package com.example.JPA.child;
import com.example.JPA.parent.Parent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Child {
    @Id
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
//    @JsonIgnoreProperties("parent")
    Parent parent;

    public Child(int id, String name, Parent parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public Parent getParent() {
        return parent;
    }

    public int getId() {
        return id;
    }
}
