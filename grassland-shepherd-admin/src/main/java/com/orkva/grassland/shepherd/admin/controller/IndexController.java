package com.orkva.grassland.shepherd.admin.controller;

import com.orkva.grassland.shepherd.security.annotation.CurrentUser;
import com.orkva.grassland.shepherd.service.sys.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    
    @Autowired
    private MenuService menuService;

    @GetMapping(value = {"", "index"})
    public String index(Model model) {
        model.addAttribute("menus", menuService.list());
        return "index";
    }

    @GetMapping(value = "users/hello")
    @ResponseBody
    public Object user(@CurrentUser Object currentUser) {
        return currentUser;
    }

}
