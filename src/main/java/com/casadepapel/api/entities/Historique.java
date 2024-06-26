package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;


@Data
@Document(collection = "historiques")
public class Historique {
    @Id
    private String id;
    private String numCompte;
    private Date dateTransaction;
    private String typeTransaction;
    private String description;
    private Double soldeAvant;
    private Double soldeApres;
    private Double montant;
    private String acteurSecondaire;
    
    // Getters and Setters
}

