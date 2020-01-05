package com.orkva.grassland.shepherd.service.sys.impl;

import com.orkva.grassland.shepherd.domain.entity.sys.Menu;
import com.orkva.grassland.shepherd.persistence.repository.sys.MenuRepository;
import com.orkva.grassland.shepherd.service.sys.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> list() {
        return menuRepository.findAll();
    }
    
    @Override
    public Menu save(Menu menu) {
        return menuRepository.saveAndFlush(menu);
    }
}
