package com.orkva.grassland.shepherd.admin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditingEntityConfiguration {

    @Bean("auditorProvider")
    public AuditorAware<Object> auditorProvider() {
        return () -> Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

}
