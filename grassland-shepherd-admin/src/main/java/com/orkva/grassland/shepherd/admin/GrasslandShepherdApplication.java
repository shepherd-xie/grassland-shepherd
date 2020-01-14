package com.orkva.grassland.shepherd.admin;

import com.orkva.plugin.service.CodeGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@SpringBootApplication(exclude = {
        RedisAutoConfiguration.class
})
public class GrasslandShepherdApplication implements CommandLineRunner {
    @Autowired
    CodeGenerateService codeGenerateService;

    public static void main(String[] args) {
        SpringApplication.run(GrasslandShepherdApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        codeGenerateService.foo();
    }
}
