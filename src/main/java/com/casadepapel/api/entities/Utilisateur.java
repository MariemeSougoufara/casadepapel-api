package com.casadepapel.api.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@Document(collection = "utilisateurs")
public class Utilisateur {
    @Id
    private String idUtilisateur;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String email;
    private String motDePasse;
    private String telephone;
    private LocalDateTime dateInscription;
    private LocalDateTime dernierAcces;
    // Getters and Setters
}
