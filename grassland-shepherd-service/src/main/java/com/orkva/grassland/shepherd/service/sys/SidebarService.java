package com.orkva.grassland.shepherd.service.sys;

import com.orkva.grassland.shepherd.domain.entity.sys.Sidebar;
import com.orkva.grassland.shepherd.service.BaseService;

import java.util.List;

public interface SidebarService extends BaseService {
    Sidebar get(Long id);
    List<Sidebar> list();
    Sidebar save(Sidebar sidebar);
    Sidebar delete(Long id);
}
