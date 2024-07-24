package com.example.prod_ready_features.production_ready_features.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //get Security Context
        //get authentication
        //get the principle
        //get the username
        return Optional.of("Deepanshu Sehgal");
    }
}