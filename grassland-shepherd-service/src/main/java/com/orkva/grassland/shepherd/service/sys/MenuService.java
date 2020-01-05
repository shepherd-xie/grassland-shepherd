package com.orkva.grassland.shepherd.service.sys;

import com.orkva.grassland.shepherd.domain.entity.sys.Menu;
import com.orkva.grassland.shepherd.service.BaseService;

import java.util.List;

public interface MenuService extends BaseService {
    List<Menu> list();

    Menu save(Menu menu);
}
