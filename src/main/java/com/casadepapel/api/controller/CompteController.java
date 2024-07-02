package com.casadepapel.api.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casadepapel.api.repositories.CompteRepository;

@RestController
@RequestMapping("/compte")
public class CompteController {
    
    @Autowired
    public CompteRepository compteRepository;

    @GetMapping("{proprietaire}")
    public ResponseEntity<Object> getCompteByProprietaire(@PathVariable String proprietaire){
        return compteRepository.findByProprietaire(proprietaire)
        .map(compte -> ResponseEntity.ok().body((Object)compte))
        .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonMap("message", "Ce compte n'existe pas")));
    }
}
