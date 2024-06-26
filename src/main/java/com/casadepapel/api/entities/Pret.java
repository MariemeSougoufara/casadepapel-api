package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;


@Data
@Document(collection = "prets")
public class Pret {
    @Id
    private String id;
    private Double montant;
    private String echeance;
    private String clientId;
    private String tauxDouble;
    private String mensualite;
    private String statut;
    
    // Getters and Setters
}
