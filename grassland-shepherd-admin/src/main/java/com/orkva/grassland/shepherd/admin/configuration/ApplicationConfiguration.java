package com.orkva.grassland.shepherd.admin.configuration;

import com.orkva.grassland.shepherd.persistence.configuration.PersistenceConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "com.orkva.grassland.shepherd")
@Import({
        PersistenceConfiguration.class,
        AuditingEntityConfiguration.class
})
public class ApplicationConfiguration implements WebMvcConfigurer {
}
