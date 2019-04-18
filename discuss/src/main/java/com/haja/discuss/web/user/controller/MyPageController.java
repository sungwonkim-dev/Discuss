package com.haja.discuss.web.user.controller;

import com.haja.discuss.web.login.controller.CommonController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mypage")
public class MyPageController extends CommonController {

    @RequestMapping("/info")
    public String requestMyInfoPage() {
        return "mypage/info";
    }

    @RequestMapping("/worry")
    public String requestMyWorryPage() {
        return "/mypage/worry";
    }

    @RequestMapping("/answer")
    public String requestMyAnswerPage() {
        return "/mypage/answer";
    }

    @RequestMapping("/favorites")
    public String requestMyFavoritesPage() {
        return "/mypage/favorites";
    }

}
