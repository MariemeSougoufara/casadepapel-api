package com.casadepapel.api.utils;



import java.time.Instant;
import java.util.Date;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import org.slf4j.Logger;

@Component
public class JWTUtil {

    private static final String SECRET_KEY = "ma-cle-secrete-pour-les-jetons-jwt";

    static Logger logger;
    

    public static String generateToken(UserDetails userDetails) {
        JwtBuilder builder = Jwts.builder()
            .setSubject(userDetails.getUsername())
            .setIssuedAt(Date.from(Instant.now()))
            .setExpiration(Date.from(Instant.now().plusSeconds(3600))) // 1 heure d'expiration
            .signWith(SignatureAlgorithm.HS256, SECRET_KEY);

        return builder.compact();
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
            Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token);
            return true;
        } catch (SignatureException ex) {
            logger.error("Signature du jeton JWT invalide");
        } catch (MalformedJwtException ex) {
            logger.error("Jeton JWT mal formé");
        } catch (ExpiredJwtException ex) {
            logger.error("Jeton JWT expiré");
        } catch (UnsupportedJwtException ex) {
            logger.error("Jeton JWT non pris en charge");
        }
        return false;
    }
}

