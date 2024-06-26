package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.ReleveCompte;

import java.util.Date;
import java.util.List;

public interface ReleveCompteRepository extends MongoRepository<ReleveCompte, String> {
    List<ReleveCompte> findByNumCompte(String numCompte);
    List<ReleveCompte> findByDateDebutBetween(Date startDate, Date endDate);
    List<ReleveCompte> findByNomBanque(String nomBanque);
}

