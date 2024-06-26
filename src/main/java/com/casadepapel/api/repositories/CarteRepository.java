package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Carte;

import java.util.Date;
import java.util.List;

public interface CarteRepository extends MongoRepository<Carte, String> {
    List<Carte> findByNumCarte(String numCarte);
    List<Carte> findByTypeCarte(String typeCarte);
    List<Carte> findByDateExpirationBefore(Date date);
}
