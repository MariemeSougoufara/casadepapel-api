package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Credit;

import java.util.List;

public interface CreditRepository extends MongoRepository<Credit, String> {
    List<Credit> findByTypeCredit(String typeCredit);
    List<Credit> findByStatut(Boolean statut);
    List<Credit> findByMontantAutoriseGreaterThan(Integer montant);
}
