package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;


@Data
@Document(collection = "releves")
public class ReleveCompte {
    @Id
    private String id;
    private String nomBanque;
    private String adresseBanque;
    private Date dateDebut;
    private Date dateFin;
    private String numCompte;
    private String periode;
    private String adresseClient;
    private Date dateOperation;
    private String reference;
    private String libelle;
    
    // Getters and Setters
}
