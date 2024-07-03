package com.casadepapel.api.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casadepapel.api.entities.Transaction;
import com.casadepapel.api.repositories.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionsController {

    @Autowired
    public TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }
    
    @GetMapping("/{email}")
    public List<Transaction> getTransactionByEmail(@PathVariable String email) {
        return transactionRepository.findByProprietaire(email);
    }

}
