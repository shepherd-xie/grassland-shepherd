package com.orkva.grassland.shepherd.security.service;

import com.orkva.grassland.shepherd.domain.entity.sys.SysUser;
import com.orkva.grassland.shepherd.persistence.repository.SysUserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Primary
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final SysUserRepository sysUserRepository;

    public UserDetailsServiceImpl(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.getByUsername(username);
        return User.withUsername(sysUser.getUsername())
                .password(sysUser.getPassword())
                .build();
    }

}
