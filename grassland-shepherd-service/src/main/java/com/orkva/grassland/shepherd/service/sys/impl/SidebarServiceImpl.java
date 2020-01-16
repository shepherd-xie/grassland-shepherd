package com.orkva.grassland.shepherd.service.sys.impl;

import com.orkva.grassland.shepherd.domain.entity.sys.Sidebar;
import com.orkva.grassland.shepherd.persistence.repository.sys.SidebarRepository;
import com.orkva.grassland.shepherd.service.sys.SidebarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SidebarServiceImpl implements SidebarService {
    @Autowired
    private SidebarRepository sidebarRepository;
    
    @Override
    public List<Sidebar> list() {
        return sidebarRepository.findByParentIdIsNull();
    }
}
