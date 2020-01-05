package com.orkva.grassland.shepherd.domain.entity.sys;

import com.orkva.grassland.shepherd.domain.entity.AbstractEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = "tb_sys_user")
public class User extends AbstractEntity {
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(unique = true, length = 64)
    private String username;
}
