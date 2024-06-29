package com.casadepapel.api.utils;

import java.time.Instant;
import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.*;

@Component
public class JWTUtil {

    private static final String SECRET_KEY = "60e654a472a36a779fd9f8af9bfd94ff50da539487703cdbda9675f4fee69b0c";

    public static String generateToken(UserDetails userDetails) {
        return Jwts.builder()
            .setSubject(userDetails.getUsername())
            .setIssuedAt(Date.from(Instant.now()))
            .setExpiration(Date.from(Instant.now().plusSeconds(3600))) // 1 heure d'expiration
            .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
            .compact();
    }

    public static String extractUsernameFromToken(String token) {
        return Jwts.parser()
            .setSigningKey(SECRET_KEY)
            .parseClaimsJws(token)
            .getBody()
            .getSubject();
    }

    public static boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
            return true;
        } catch (SignatureException | MalformedJwtException | ExpiredJwtException | UnsupportedJwtException ex) {
            return false;
        }
    }
}
