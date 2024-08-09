package com.example.JPA.parent;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, String> {

    Optional<Parent> findByName(String name);

}
