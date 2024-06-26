package com.casadepapel.api.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String numTransaction;
    private String numCompteSource;
    private String numCompteDestination;
    private String typeTransaction;
    private Double montantTransaction;
    private Date dateTransaction;
    
    // Getters and Setters
}
