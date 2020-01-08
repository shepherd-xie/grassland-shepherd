package com.orkva.grassland.shepherd.service.sys;

import com.orkva.grassland.shepherd.domain.entity.sys.User;
import com.orkva.grassland.shepherd.service.BaseService;

import java.util.List;

public interface UserService extends BaseService {
    User getUser(String username);
    User authentication(String username, String password);
    List<User> listUser();
    User register(String username, String password);
}
