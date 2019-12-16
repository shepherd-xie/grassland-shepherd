package com.orkva.grassland.shepherd.persistence.repository;

import com.orkva.grassland.shepherd.domain.entity.sys.User;
import com.orkva.grassland.shepherd.persistence.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User> {

    User getByUsername(String username);

}
