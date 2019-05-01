package com.haja.discuss.web.user.controller;

import com.haja.discuss.web.login.controller.CommonController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static com.haja.discuss.DiscussContants.*;

@Controller
@RequestMapping(value = "/discuss")
public class DiscussController extends CommonController {

    @RequestMapping("/live")
    public String requestLiveDiscussPage() {
        return VIEW_DISCUSS_LIVE_PAGE;
    }

    @RequestMapping("/interested")
    public String requestInterestedDiscussPage() {
        return VIEW_DISCUSS_INTERESTED_PAGE;
    }

    @RequestMapping("/debate")
    public String requestDebateDiscussPage() {
        return VIEW_DISCUSS_DEBATE_PAGE;
    }

    @RequestMapping("/free")
    public String requestFreeDiscussPage() {
        return VIEW_DISCUSS_FREE_PAGE;
    }

    @RequestMapping("/rank")
    public String requestRankPage() {
        return VIEW_DISCUSS_RANK_PAGE;
    }

    @RequestMapping("/write")
    public String requestWritePage(@RequestParam(value = "text-editor", required = false) String text,
                                   Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.getPrincipal());

        if (text != null) System.out.println(text);

        return VIEW_DISCUSS_WRITE_PAGE;
    }

    @RequestMapping("/encode-base64")
    @ResponseBody
    public String encodeImageByBase64(HttpServletRequest request) {

        String encodedImage = "";

        return encodedImage;
    }
}
