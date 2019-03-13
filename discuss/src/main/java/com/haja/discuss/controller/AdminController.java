package com.haja.discuss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/admin" )
public class AdminController {

    @RequestMapping("/management/user")
    public String requestManagementUserPage() {
        return "/admin/management/user";
    }

    @RequestMapping("/management/worry")
    public String requestManagementWorryPage() {
        return "/admin/management/worry";
    }
}
