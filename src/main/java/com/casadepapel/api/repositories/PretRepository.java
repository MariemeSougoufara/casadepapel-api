package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Pret;

import java.util.Date;
import java.util.List;

public interface PretRepository extends MongoRepository<Pret, String> {
    List<Pret> findByClientId(String clientId);
    List<Pret> findByStatut(String statut);
    List<Pret> findByMontantGreaterThan(Double montant);
    List<Pret> findByEcheanceBefore(Date date);
}

