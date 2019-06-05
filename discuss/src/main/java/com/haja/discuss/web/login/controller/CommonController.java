package com.haja.discuss.web.login.controller;

import com.haja.discuss.DiscussContants;
import com.haja.discuss.DiscussRuntimeException;
import com.haja.discuss.entity.User;
import com.haja.discuss.web.login.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import static com.haja.discuss.DiscussContants.*;


@Controller
@RequestMapping(value = "/")
public class CommonController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String requestLogin(@RequestParam(value = "error", required = false, defaultValue = "") String error,
                               ModelMap modelMap) {
        if (error != null && error.length() != -1)
            modelMap.put("msg", "error");

        putUserInfo(modelMap);

        return VIEW_LOGIN_PAGE;
    }

    @RequestMapping(value = "/access-denied")
    public String requestAccessDeniedPage(ModelMap modelMap) {
        JSONObject msg = new JSONObject();
        msg.put("code", "401");
        msg.put("msg", "access-denied");
        modelMap.put("response", msg.toString());
        return VIEW_ACCESS_DENIED_PAGE;
    }

    @RequestMapping(value = "/home")
    public String requestHome(ModelMap modelMap) {
        putUserInfo(modelMap);
        return VIEW_HOME_PAGE;
    }

    @RequestMapping(value = "/create-account")
    public String requestCreateAccount() {
        return DiscussContants.VIEW_CREATE_ACCOUNT_PAGE;
    }

    @RequestMapping(value = "/save-account", method = RequestMethod.POST)
    @ResponseBody
    public void saveAccount(@ModelAttribute("User") User user) throws Exception {
        try {
            userService.createUserAccount(user);
        } catch (Exception e) {
            throw new DiscussRuntimeException(e);
        }
    }

    public String getUidInCurContext() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        String uid = null;

        if (principal instanceof UserDetails) {
            uid = ((UserDetails) principal).getUsername();
        }
        return uid;
    }

    public User getUserInCurContext() {
        return userService.findByUid(getUidInCurContext());
    }

    public void putUserInfo(ModelMap modelMap) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            modelMap.put("user", username);
        }
    }
}

