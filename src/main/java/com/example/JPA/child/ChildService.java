package com.example.JPA.child;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class ChildService {

    private ChildRepository childRepository;

    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }
    @Transactional
    public void saveChild(Child child){
        childRepository.save(child);
    }


}
