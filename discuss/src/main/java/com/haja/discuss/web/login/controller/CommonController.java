package com.haja.discuss.web.login.controller;

import com.haja.discuss.DiscussContants;
import com.haja.discuss.DiscussRuntimeException;
import com.haja.discuss.entity.Discussion;
import com.haja.discuss.entity.User;
import com.haja.discuss.util.DateUtils;
import com.haja.discuss.web.login.service.UserService;
import com.haja.discuss.web.user.service.DiscussService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            System.out.println(username);
        }


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
    public String handleDiscussRuntimeException(Exception e) {
        try {
            Map<String, String> errorData = new HashMap<String, String>();
            errorData.put("msg", e.getMessage());
            errorData.put("status", "error");
            JSONObject json = new JSONObject(errorData);
            return json.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return DiscussContants.VIEW_HOME_PAGE;
        }
    }


    @Autowired
    DiscussService discussService;

    @RequestMapping("/test")
    public String requestTest(@RequestParam(value = "pageNo", defaultValue = "1", required = false) String pageNo,
                              @RequestParam(value = "discussionCount", defaultValue = "1", required = false) String discussionCount,
                              @RequestParam(value = "size", defaultValue = "10", required = false) String size,
                              ModelMap modelMap) {

        Discussion discussion = new Discussion("1", "2", "3", DateUtils.now());
        discussService.saveDiscussionContent(discussion);

        List<Discussion> tempList = discussService.findAllDiscussion();

        System.out.println(tempList.size());
        System.out.println(tempList.toString());

        modelMap.put("discussionList",tempList);
        modelMap.put("pageNo",pageNo);
        modelMap.put("discussionCount",tempList.size());
        modelMap.put("size",size);

        return "/common/test";
    }

}

