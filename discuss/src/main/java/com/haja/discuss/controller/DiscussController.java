package com.haja.discuss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/discuss")
public class DiscussController {

    @RequestMapping("/live")
    public String requestLiveDiscussPage() {
        return "/discuss/live";
    }

    @RequestMapping("/interested")
    public String requestInterestedDiscussPage() {
        return "/discuss/interested";
    }

    @RequestMapping("/debate")
    public String requestDebateDiscussPage() {
        return "/discuss/debate";
    }

    @RequestMapping("/free")
    public String requestFreeDiscussPage() {
        return "/discuss/free";
    }

    @RequestMapping("/rank")
    public String requestRankPage() {
        return "/discuss/rank";
    }
}
