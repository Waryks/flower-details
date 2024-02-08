package org.soa.service;

import io.smallrye.jwt.build.Jwt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;

@ApplicationScoped
public class FlowerJwtAuthService {
    public String generateJwt(String role, Long customerId) {
        long duration = System.currentTimeMillis() + 3600;
        return Jwt.issuer("https://beautyfulflowers.com")
                .subject("flower-shop-person")
                .groups(role)
                .claim("customerId", customerId)
                .expiresAt(duration)
                .sign();
    }
}
