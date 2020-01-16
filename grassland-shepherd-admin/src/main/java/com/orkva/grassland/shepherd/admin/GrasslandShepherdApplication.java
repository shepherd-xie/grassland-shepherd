package com.orkva.grassland.shepherd.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@SpringBootApplication(exclude = {
        RedisAutoConfiguration.class
})
public class GrasslandShepherdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrasslandShepherdApplication.class, args);
    }

}
