package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Compte;

import java.util.Date;
import java.util.List;

public interface CompteRepository extends MongoRepository<Compte, String> {
    List<Compte> findByNumCompte(String numCompte);
    List<Compte> findByEtatCompte(Boolean etatCompte);
    List<Compte> findByMontantInitialGreaterThan(Double montant);
    List<Compte> findByDateCreationBetween(Date startDate, Date endDate);
}
