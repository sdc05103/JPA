package com.example.JPA.parent;

import com.example.JPA.child.Child;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Parent {

    @Id
    private String id;
    private String name;

    // 내가 주인이 아니라 속성을 추가해야함
    // 연관 관계 주인 객체가 해당 객체를 참조할 때 쓰는 필드명
    @OneToMany(mappedBy = "parent")
    @JsonIgnoreProperties("parent")
    private List<Child> children;

    public Parent(String id, String name, List<Child> children) {
        this.id = id;
        this.name = name;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Child> getChildren() {
        return children;
    }
}
