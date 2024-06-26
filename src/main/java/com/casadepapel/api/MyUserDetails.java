package com.casadepapel.api;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.casadepapel.api.entities.Utilisateur;

public class MyUserDetails implements UserDetails {

    private final Utilisateur utilisateur;

    public MyUserDetails(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String getUsername() {
        return utilisateur.getEmail(); // Remplacez par le champ d'identification unique
    }

    @Override
    public String getPassword() {
        return utilisateur.getMotDePasse();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    // Implémentez les autres méthodes requises par UserDetails (authorities, etc.)
    // en fonction de votre entité Utilisateur
}
