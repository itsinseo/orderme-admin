package org.example.ordermeadmin.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class PageController {

    @GetMapping("/admin/dashboard")
    public String dashboard() {
        return "/admin/dashboard";
    }
}
