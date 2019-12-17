package com.orkva.grassland.shepherd.persistence.configuration;

import com.orkva.grassland.shepherd.domain.entity.BaseEntity;
import com.orkva.grassland.shepherd.persistence.repository.BaseRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = BaseRepository.class)
@EntityScan(basePackageClasses = BaseEntity.class)
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class PersistenceConfiguration {
}
