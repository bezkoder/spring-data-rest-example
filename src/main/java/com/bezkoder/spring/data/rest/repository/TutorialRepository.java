package com.bezkoder.spring.data.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bezkoder.spring.data.rest.model.Tutorial;

@CrossOrigin(origins = "http://localhost:8081")
@RepositoryRestResource(path="tutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContainingIgnoreCase(String title);
}
