package com.casadepapel.api.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "admins")
public class Admin extends Utilisateur {
    private String niveauAcces;
    private String privileges;
    private Date dateEmbauche;
    
    // Getters and Setters
}
