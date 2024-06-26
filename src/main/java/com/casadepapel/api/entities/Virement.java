package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "virements")
public class Virement {
    @Id
    private String id;
    private String idCompteEmetteur;
    private String idCompteRecepteur;
    private Double montant;
    private Date date;
    private String description;
    private String statut;
    
    // Getters and Setters
}

