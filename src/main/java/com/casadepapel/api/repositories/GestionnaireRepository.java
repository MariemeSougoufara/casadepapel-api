package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Gestionnaire;

import java.util.Date;
import java.util.List;

public interface GestionnaireRepository extends MongoRepository<Gestionnaire, String> {
    List<Gestionnaire> findByRegion(String region);
    List<Gestionnaire> findByDateEmbaucheBefore(Date date);
    List<Gestionnaire> findByListeClientsContaining(String clientId);
}
