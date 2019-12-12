package com.orkva.grassland.shepherd.admin.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "com.orkva.grassland.shepherd")
public class ApplicationConfiguration implements WebMvcConfigurer {
}
