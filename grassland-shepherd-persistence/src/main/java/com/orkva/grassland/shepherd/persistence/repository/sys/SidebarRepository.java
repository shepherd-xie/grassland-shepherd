package com.orkva.grassland.shepherd.persistence.repository.sys;

import com.orkva.grassland.shepherd.domain.entity.sys.Sidebar;
import com.orkva.grassland.shepherd.persistence.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SidebarRepository extends BaseRepository<Sidebar> {
    List<Sidebar> findByParentIdIsNull();
}
