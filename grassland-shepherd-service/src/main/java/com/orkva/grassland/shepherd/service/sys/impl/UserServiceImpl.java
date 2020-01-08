package com.orkva.grassland.shepherd.service.sys.impl;

import com.orkva.grassland.shepherd.domain.entity.sys.User;
import com.orkva.grassland.shepherd.persistence.repository.sys.UserRepository;
import com.orkva.grassland.shepherd.service.sys.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User getSysUser(String username) {
        return userRepository.getByUsername(username);
    }
    
    @Override
    public User register(String username, String password) {
        return userRepository.saveAndFlush(User.withUsername(username).password(passwordEncoder.encode(password)).build());
    }

    @Override
    public User getUser(String username) {
        return userRepository.getByUsername(username);
    }

    @Override
    public User authentication(String username, String password) {
        User user = getSysUser(username);
        if (passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException();
        }
        return user;
    }

    @Override
    public List<User> listUser() {
        return userRepository.findAll();
    }

}
