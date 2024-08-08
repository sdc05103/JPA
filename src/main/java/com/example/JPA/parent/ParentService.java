package com.example.JPA.parent;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class ParentService {

    private ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    @Transactional
    public void saveParent(Parent parent){
        parentRepository.save(parent);
    }
}
