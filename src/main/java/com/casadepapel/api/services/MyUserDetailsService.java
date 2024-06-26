package com.casadepapel.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.casadepapel.api.MyUserDetails;
import com.casadepapel.api.entities.Utilisateur;
import com.casadepapel.api.repositories.UtilisateurRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur user = userRepository.findByEmail(username); // Remplacez par la méthode de recherche appropriée
        if (user == null) {
            throw new UsernameNotFoundException("Utilisateur introuvable");
        }
        return new MyUserDetails(user);
    }
}
