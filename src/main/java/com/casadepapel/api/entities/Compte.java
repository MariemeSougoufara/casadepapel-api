package com.casadepapel.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "comptes")
public class Compte {
    @Id
    private String idCompte;
    private String numCompte;
    private Date dateCreation;
    private Double montantInitial;
    private Double plafonds;
    private Boolean etatCompte;
    private String proprietaire;
}
