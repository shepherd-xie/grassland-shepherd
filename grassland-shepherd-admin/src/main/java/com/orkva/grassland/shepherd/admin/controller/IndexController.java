package com.orkva.grassland.shepherd.admin.controller;

import com.orkva.grassland.shepherd.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = {"", "index"})
    public Object index() {
        return userRepository.findAll();
    }

}
