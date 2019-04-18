package com.haja.discuss.web.user.controller;

import com.haja.discuss.web.login.controller.CommonController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
