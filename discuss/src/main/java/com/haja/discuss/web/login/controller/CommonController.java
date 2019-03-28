package com.haja.discuss.web.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class CommonController {

    @RequestMapping(value = "/login")
    public String requestLogin(@RequestParam(value = "error", required = false) String error,
                               ModelMap modelMap) {
        if (error != null && error.length() != -1)
            modelMap.put("msg","error");
            return "/common/login";
    }

    @RequestMapping(value = "/home")
    public String requestHome() {
        return "/home";
    }


}
