package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "credits")
public class Credit {
    @Id
    private String idCredit;
    private String typeCredit;
    private Integer montantAutorise;
    private Integer tauxInteret;
    private Boolean statut;
    
    // Getters and Setters
}

