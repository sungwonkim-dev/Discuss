package com.haja.discuss.web.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/mypage")
public class MyPageController {

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
