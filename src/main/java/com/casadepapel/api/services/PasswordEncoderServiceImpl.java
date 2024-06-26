package com.casadepapel.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderServiceImpl implements PasswordEncoder {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public String encode(CharSequence rawPassword) {
        return passwordEncoder.encode(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword.toString(), encodedPassword);
    }
}
