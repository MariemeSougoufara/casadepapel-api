
package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;


@Data
@Document(collection = "gestionnaires")
public class Gestionnaire extends Utilisateur {
    private String listeClients;
    private String region;
    private Date dateEmbauche;
    
    // Getters and Setters
}
