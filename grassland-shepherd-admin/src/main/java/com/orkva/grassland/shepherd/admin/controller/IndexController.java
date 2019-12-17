package com.orkva.grassland.shepherd.admin.controller;

import com.orkva.grassland.shepherd.security.annotation.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping(value = {"", "index"})
    public String index() {
        return "index";
    }

    @GetMapping(value = "users/hello")
    @ResponseBody
    public Object user(@CurrentUser Object currentUser) {
        return currentUser;
    }

}
