package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Virement;

import java.util.Date;
import java.util.List;

public interface VirementRepository extends MongoRepository<Virement, String> {
    List<Virement> findByIdCompteEmetteur(String idCompteEmetteur);
    List<Virement> findByIdCompteRecepteur(String idCompteRecepteur);
    List<Virement> findByDateBetween(Date startDate, Date endDate);
    List<Virement> findByMontantGreaterThan(Double montant);
}

