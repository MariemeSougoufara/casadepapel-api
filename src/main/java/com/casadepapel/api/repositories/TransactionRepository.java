package com.casadepapel.api.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.casadepapel.api.entities.Transaction;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByNumCompteSource(String numCompteSource);
    List<Transaction> findByNumCompteDestination(String numCompteDestination);
    List<Transaction> findByTypeTransaction(String typeTransaction);
    List<Transaction> findByDateTransactionBetween(Date startDate, Date endDate);
    List<Transaction> findByProprietaire(String proprietaire);
}
