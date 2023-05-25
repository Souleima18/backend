package com.souleima.biscuits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.souleima.biscuits.entities.Marque;
@RepositoryRestResource(path = "cat")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular 
public interface MarqueRepository extends JpaRepository<Marque, Long> {

}
