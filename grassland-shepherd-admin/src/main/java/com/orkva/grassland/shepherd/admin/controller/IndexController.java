package com.orkva.grassland.shepherd.admin.controller;

import com.orkva.grassland.shepherd.service.sys.MenuService;
import com.orkva.grassland.shepherd.service.sys.SidebarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private MenuService menuService;
    @Autowired
    private SidebarService sidebarService;

    @GetMapping(value = {"", "index"})
    public String index(Model model) {
        model.addAttribute("sidebars", sidebarService.list());
        return "index";
    }

}
