package com.example.JPA.child;

import com.example.JPA.parent.Parent;
import com.example.JPA.parent.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildController {

    private final ChildService childService;
    private final ParentService parentService;

    @Autowired
    public ChildController(ChildService childService, ParentService parentService) {
        this.childService = childService;
        this.parentService = parentService;
    }

    @PostMapping("/child")
    public void saveChild(){
        Parent parent = new Parent("parent1", "parent1");
        parentService.saveParent(parent);

        Child child = new Child(1, "child1", parent);
        childService.saveChild(child);
    }

}
