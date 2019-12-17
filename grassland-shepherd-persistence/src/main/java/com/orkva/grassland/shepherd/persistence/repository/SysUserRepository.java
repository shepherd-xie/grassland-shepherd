package com.orkva.grassland.shepherd.persistence.repository;

import com.orkva.grassland.shepherd.domain.entity.sys.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends BaseRepository<SysUser> {

    SysUser getByUsername(String username);

}
