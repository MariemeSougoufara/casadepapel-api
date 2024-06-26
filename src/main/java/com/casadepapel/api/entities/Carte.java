package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "cartes")
public class Carte {
    @Id
    private String idCarte;
    private String numCarte;
    private String typeCarte;
    private Date dateExpiration;
    private String cryptogramme;
    private String signature;
    
    // Getters and Setters
}
