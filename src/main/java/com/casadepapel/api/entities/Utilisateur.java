package com.casadepapel.api.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Data
@Document(collection = "utilisateurs")
public class Utilisateur {
    @Id
    private String idUtilisateur;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    
    @Indexed(unique = true)
    private String email;
    private String motDePasse;
    private String telephone;
    private Compte compte;
    private List<Transaction> transactions;
    private String type;
    private LocalDateTime dateInscription;
    private LocalDateTime dernierAcces;
    // Getters and Setters
}
