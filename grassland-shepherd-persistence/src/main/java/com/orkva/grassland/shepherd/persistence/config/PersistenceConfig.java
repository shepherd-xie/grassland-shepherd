package com.orkva.grassland.shepherd.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.orkva.grassland.shepherd.persistence.repository")
@EntityScan(basePackages = "com.orkva.grassland.shepherd.domain.entity")
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class PersistenceConfig {
}
