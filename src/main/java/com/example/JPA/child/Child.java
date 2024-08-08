package com.example.JPA.child;
import com.example.JPA.parent.Parent;
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
    Parent parent;

    public Child(int id, String name, Parent parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }


}
