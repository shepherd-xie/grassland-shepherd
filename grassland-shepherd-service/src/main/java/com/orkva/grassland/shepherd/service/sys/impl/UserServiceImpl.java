package com.orkva.grassland.shepherd.service.sys.impl;

import com.orkva.grassland.shepherd.domain.entity.sys.User;
import com.orkva.grassland.shepherd.persistence.repository.sys.UserRepository;
import com.orkva.grassland.shepherd.service.sys.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User getSysUser(String email) {
        return userRepository.getByEmail(email);
    }
    
    public User register(String email, String password) {
        return userRepository.saveAndFlush(User.builder().email(email).password(passwordEncoder.encode(password)).build());
    }

    public User authentication(String email, String password) {
        User user = getSysUser(email);
        if (passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException();
        }
        return user;
    }

}
