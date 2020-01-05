package com.orkva.grassland.shepherd.security.service;

import com.orkva.grassland.shepherd.domain.entity.sys.User;
import com.orkva.grassland.shepherd.persistence.repository.sys.UserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Primary
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository sysUserRepository;

    public UserDetailsServiceImpl(UserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User sysUser = sysUserRepository.getByUsername(username);
        return org.springframework.security.core.userdetails.User.withUsername(sysUser.getUsername())
                .password(sysUser.getPassword())
                .build();
    }

}
