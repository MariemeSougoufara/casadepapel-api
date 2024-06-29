package com.casadepapel.api;

import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.casadepapel.api.entities.Utilisateur;

public class MyUserDetails implements UserDetails {

    private final Utilisateur utilisateur;

    public MyUserDetails(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public MyUserDetails(Optional<Utilisateur> user) {
        this.utilisateur = user.orElseThrow();
    }

    @Override
    public String getUsername() {
        return utilisateur.getEmail();
    }

    @Override
    public String getPassword() {
        return utilisateur.getMotDePasse();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
