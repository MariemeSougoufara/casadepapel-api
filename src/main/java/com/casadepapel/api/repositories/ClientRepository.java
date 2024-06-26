package com.casadepapel.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Client;

import java.util.List;

public interface ClientRepository extends MongoRepository<Client, String> {
    List<Client> findByNumeroCompte(String numeroCompte);
    List<Client> findBySoldeGreaterThan(Double solde);
    List<Client> findByNom(String nom);
}
