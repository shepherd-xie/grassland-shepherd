package com.orkva.grassland.shepherd.admin.controller.sys;

import com.orkva.grassland.shepherd.domain.entity.sys.Menu;
import com.orkva.grassland.shepherd.service.sys.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }
    
    @GetMapping(value = "menus")
    public List<Menu> list() {
        return menuService.list();
    }
    
    @PostMapping(value = "menus")
    public Menu save(@RequestBody Menu menu) {
        return menuService.save(menu);
    }

    @DeleteMapping(value = "menus/{id}")
    public Menu delete(@PathVariable("id") Long id) {
        return null;
    }
}
