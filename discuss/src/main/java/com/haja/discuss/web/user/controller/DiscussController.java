package com.haja.discuss.web.user.controller;

import com.haja.discuss.entity.Comment;
import com.haja.discuss.entity.Discussion;
import com.haja.discuss.entity.User;
import com.haja.discuss.web.login.controller.CommonController;
import com.haja.discuss.web.login.service.UserService;
import com.haja.discuss.web.user.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.haja.discuss.DiscussContants.*;

@Controller
@RequestMapping(value = "/discuss")
public class DiscussController extends CommonController {

    @Autowired
    DiscussService discussService;

    @Autowired
    UserService userService;


    @RequestMapping("")
    public String requestDiscussHomePage(ModelMap modelMap) {

        putUserInfo(modelMap);

        return VIEW_DISCUSS_HOME_PAGE;
    }

    @RequestMapping("/live")
    public String requestLiveDiscussPage(ModelMap modelMap) {

        putUserInfo(modelMap);
        List<Discussion> discussionList = discussService.findRecentlySavedDiscussionOrderByCreated();
        modelMap.put("discussionList", discussionList);

        return VIEW_DISCUSS_LIVE_PAGE;
    }

    @RequestMapping("/interested")
    public String requestInterestedDiscussPage(ModelMap modelMap) {

        putUserInfo(modelMap);
        User user = getUserInCurContext();
        List<Discussion> discussionList = discussService.findAllMyInterestingDiscussion(user);
        modelMap.put("discussionList", discussionList);

        return VIEW_DISCUSS_INTERESTED_PAGE;
    }

    @RequestMapping("/debate")
    public String requestDebateDiscussPage(@RequestParam(value = "pageNo", defaultValue = "1", required = false) String pageNo,
                                           @RequestParam(value = "discussionCount", defaultValue = "1", required = false) String discussionCount,
                                           @RequestParam(value = "size", defaultValue = "10", required = false) String size,
                                           ModelMap modelMap) {

        putUserInfo(modelMap);
        List<Discussion> tempList = discussService.findAllDiscussionOrderByDid(pageNo, size);

        modelMap.put("discussionList", tempList);
        modelMap.put("pageNo", pageNo);
        modelMap.put("discussionCount", discussService.getAllDiscussionSize());
        modelMap.put("size", size);

        return VIEW_DISCUSS_DEBATE_PAGE;
    }

    @RequestMapping("/rank")
    public String requestRankPage(ModelMap modelMap) {
        putUserInfo(modelMap);

        List<Discussion> discussionList = discussService.findTop10OrderByVisitedCount();
        modelMap.put("discussionList", discussionList);

        return VIEW_DISCUSS_RANK_PAGE;
    }

    @RequestMapping("/write")
    public String requestWritePage(ModelMap modelMap) {

        putUserInfo(modelMap);

        return VIEW_DISCUSS_WRITE_PAGE;
    }

    @RequestMapping("/save-content")
    @ResponseBody
    public String saveContent(@RequestParam(value = "title", required = false) String title,
                              @RequestParam(value = "text-editor", required = false) String content) {

        Discussion discussion = discussService.saveDiscussionContent(getUserInCurContext(), title, content);

        String did = EMPTY_DID;
        if (discussion != null || discussion.getDid() != null)
            did = String.valueOf(discussion.getDid());

        return did;
    }

    @RequestMapping("/detail")
    public String requestDetail(@RequestParam(value = "did", required = true) String did,
                                ModelMap modelMap) {

        putUserInfo(modelMap);
        modelMap.put("discussion", discussService.findByDid(did));
        modelMap.put("comments", discussService.findAllCommentByDid(did));
        
        return VIEW_DISCUSS_DETAIL_PAGE;
    }

    @RequestMapping("/save-comment")
    @ResponseBody
    public String saveComment(@RequestParam(value = "text-editor", required = false) String content,
                              @RequestParam(value = "t-did") String did) {

        Comment comment = discussService.saveDiscussionComment(did, content);

        String callBackdid = EMPTY_DID;
        if (comment != null || comment.getDid() != null)
            callBackdid = String.valueOf(comment.getDid());

        return callBackdid;
    }
}
