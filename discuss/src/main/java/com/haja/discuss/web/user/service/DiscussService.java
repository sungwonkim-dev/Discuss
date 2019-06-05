package com.haja.discuss.web.user.service;

import com.haja.discuss.entity.*;
import com.haja.discuss.util.DateUtils;
import com.haja.discuss.web.user.repository.CommentRepository;
import com.haja.discuss.web.user.repository.CountRepository;
import com.haja.discuss.web.user.repository.DiscussRepository;
import com.haja.discuss.web.user.repository.InterestedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class DiscussService {

    @Autowired
    DiscussRepository discussRepository;
    @Autowired
    CountRepository countRepository;
    @Autowired
    InterestedRepository interestedRepository;
    @Autowired
    CommentRepository commentRepository;

    public int getAllDiscussionSize() {
        return discussRepository.findAll().size();
    }

    public List<Discussion> findAllDiscussionOrderByDid(String pageNo, String size) {

        int page = Integer.parseInt(pageNo);
        int pageSize = Integer.parseInt(size);

        PageRequest pageRequest
                = PageRequest.of(page - 1, pageSize, new Sort(Sort.Direction.DESC, "did"));

        return discussRepository.findAll(pageRequest).getContent();
    }

    public Discussion findByDid(String did) {

        Long id = Long.valueOf(did);
        Discussion discussion = discussRepository.findByDid(id);
        Count count = countRepository.findByDid(id);
        count.setVisited(count.getVisited() + 1);
        countRepository.save(count);

        return discussion;
    }

    public List<Discussion> findTop10OrderByVisitedCount() {

        int last = 10;

        List<Count> countList = countRepository.findAll(new Sort(Sort.Direction.DESC, "visited"));
        if (countList.size() < 10)
            last = countList.size();

        countList = countList.subList(0, last);
        Set<Long> didList = new HashSet<>();

        for (Count c : countList)
            didList.add(c.getDid());

        return discussRepository.findAllByDidIn(didList);
    }

    public List<Discussion> findRecentlySavedDiscussionOrderByCreated() {

        return discussRepository.findFirst10ByCreatedBetween(DateUtils.minus(60000), DateUtils.now(), new Sort(Sort.Direction.DESC, "created"));
    }

    public List<Discussion> findAllMyInterestingDiscussion(User user) {

        List<Interested> interestedList = interestedRepository.findAllByUid(user.getId());

        Set<Long> didList = new HashSet<>();

        for (Interested i : interestedList)
            didList.add(i.getDid());

        return discussRepository.findAllByDidIn(didList);
    }

    public Discussion saveDiscussionContent(User user, String title, String content) {

        Discussion discussion = new Discussion(user.getId(), user.getUid(), title, content, DateUtils.now());
        discussion = discussRepository.save(discussion);
        Count count = new Count(discussion.getDid());
        countRepository.save(count);

        return discussion;
    }

    public Comment saveDiscussionComment(String did, String content) {
        Comment comment = new Comment(did, content);
        return commentRepository.save(comment);
    }

    public List<Comment> findAllCommentByDid(String did) {
        Long id = Long.valueOf(did);
        List<Comment> commentList = commentRepository.findAllByDid(id);

        return commentList;
    }
}

