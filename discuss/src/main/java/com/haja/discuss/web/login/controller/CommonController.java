package com.haja.discuss.web.login.controller;

import com.haja.discuss.DiscussContants;
import com.haja.discuss.DiscussRuntimeException;
import com.haja.discuss.entity.User;
import com.haja.discuss.web.login.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/")
public class CommonController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String requestLogin(@RequestParam(value = "error", required = false) String error,
                               ModelMap modelMap) {
        if (error != null && error.length() != -1)
            modelMap.put("msg", "error");
        return DiscussContants.VIEW_LOGIN_PAGE;
    }

    @RequestMapping(value = "/home")
    public String requestHome() {
        return DiscussContants.VIEW_HOME_PAGE;
    }

    @RequestMapping(value = "/create-account")
    public String reqeustCreateAccount() {
        return DiscussContants.VIEW_CREATE_ACCOUNT_PAGE;
    }

    @RequestMapping(value = "/save-account", method = RequestMethod.POST)
    @ResponseBody
    public void saveAccount(HttpServletResponse httpServletResponse,
                              ModelMap modelMap,
                              @ModelAttribute("User") User user) throws Exception {
        try {
            userService.createUserAccount(user);
        } catch (Exception e) {
            throw new DiscussRuntimeException(e);
        }
    }

    @ExceptionHandler(DiscussRuntimeException.class)
    @ResponseBody
    public String handleDiscussRuntimeException(Exception e){
        try {
            Map<String, String> errorData = new HashMap<String, String>();
            errorData.put("msg",e.getMessage());
            errorData.put("status","error");
            JSONObject json = new JSONObject(errorData);
            return json.toString();
        }
        catch (Exception ex){
            ex.printStackTrace();
            return DiscussContants.VIEW_HOME_PAGE;
        }
    }

}
