package com.casadepapel.api.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "clients")
public class Client extends Utilisateur {
    private String numeroCompte;
    private Double solde;
    
    // Getters and Setters
}
