package com.example.JPA.parent;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class ParentService {

    private ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    public void saveParent(Parent parent){
        parentRepository.save(parent);
    }

    public Parent findParent(String id){
        Parent p =  parentRepository.findById(id).orElseThrow();
        return p;
    }

    public Parent findParentByName(String name){
        Parent p = parentRepository.findByName(name).orElseThrow();
        return p;
    }
}
