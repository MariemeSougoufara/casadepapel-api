package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Historique;


import java.util.Date;
import java.util.List;

public interface HistoriqueRepository extends MongoRepository<Historique, String> {
    List<Historique> findByNumCompte(String numCompte);
    List<Historique> findByTypeTransaction(String typeTransaction);
    List<Historique> findByDateTransactionBetween(Date startDate, Date endDate);
    List<Historique> findByMontantGreaterThan(Double montant);
}

