package com.orkva.grassland.shepherd.persistence.repository.sys;

import com.orkva.grassland.shepherd.domain.entity.sys.User;
import com.orkva.grassland.shepherd.persistence.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User> {

    User getByUsername(String username);
    
    User getByEmail(String email);

}
