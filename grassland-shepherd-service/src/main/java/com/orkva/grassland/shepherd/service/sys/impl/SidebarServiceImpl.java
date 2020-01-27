package com.orkva.grassland.shepherd.service.sys.impl;

import com.orkva.grassland.shepherd.domain.entity.sys.Sidebar;
import com.orkva.grassland.shepherd.persistence.repository.sys.SidebarRepository;
import com.orkva.grassland.shepherd.service.sys.SidebarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class SidebarServiceImpl implements SidebarService {
    @Autowired
    private SidebarRepository sidebarRepository;

    @Override
    public Sidebar get(Long id) {
        return sidebarRepository.getOne(id);
    }

    @Override
    public List<Sidebar> list() {
        return sidebarRepository.findByParentIdIsNull();
    }

    @Override
    @Transactional
    public Sidebar save(Sidebar sidebar) {
        return sidebarRepository.saveAndFlush(sidebar);
    }

    @Override
    @Transactional
    public Sidebar delete(Long id) {
        Sidebar sidebar = get(id);
        if (sidebar == null) {
            return null;
        }
        sidebarRepository.deleteById(id);
        return sidebar;
    }

}
