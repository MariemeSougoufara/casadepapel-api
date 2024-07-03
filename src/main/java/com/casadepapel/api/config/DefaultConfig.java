package com.casadepapel.api.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DefaultConfig {
    
    @Value("${app.default.montant-initial}")
    private Double defaultMontantInitial;
    
    @Value("${app.default.default-plafond}")
    private Double defaultPlafond;
    
    // Getters
    
    public Double getDefaultMontantInitial() {
        return defaultMontantInitial;
    }

    public Double getDefaultPlafonds() {
        return defaultPlafond;
    }
}
