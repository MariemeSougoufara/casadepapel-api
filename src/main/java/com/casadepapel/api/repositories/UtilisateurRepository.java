package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.casadepapel.api.entities.Utilisateur;




@RepositoryRestController(path = "/auth/users")
public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {
    Utilisateur findByEmail(String email);
}

