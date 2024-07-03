package com.casadepapel.api.services;

import com.casadepapel.api.entities.Compte;
import com.casadepapel.api.repositories.CompteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class CompteService {

    @Autowired
    private CompteRepository compteRepository; // Assurez-vous d'avoir un repository pour Compte

    public String generateNumCompte() {
        // Génération du numéro de compte avec UUID
        return UUID.randomUUID().toString();
    }

    public Compte createCompte(Double montantInitial, Double plafonds, String proprietaire) {
        Compte compte = new Compte();
        compte.setNumCompte(generateNumCompte());
        compte.setDateCreation(new Date());
        compte.setMontantInitial(montantInitial);
        compte.setPlafonds(plafonds);
        compte.setEtatCompte(true);
        compte.setProprietaire(proprietaire);
        return compteRepository.save(compte);
    }
}
