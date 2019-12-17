package com.orkva.grassland.shepherd.service.impl;

import com.orkva.grassland.shepherd.domain.entity.sys.SysUser;
import com.orkva.grassland.shepherd.persistence.repository.SysUserRepository;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl {

    private final SysUserRepository sysUserRepository;

    private final PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    public SysUserServiceImpl(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    public SysUser getSysUser(String username) {
        return sysUserRepository.getByUsername(username);
    }

    public SysUser authentication(String username, String password) {
        SysUser user = getSysUser(username);
        if (passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException();
        }
        return user;
    }

}
