package com.haja.discuss.web.user.service;

import com.haja.discuss.entity.Discussion;
import com.haja.discuss.web.user.repository.DiscussRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussService {
    @Autowired
    DiscussRepository discussRepository;

    public void saveDiscussionContent(Discussion discussion){
        System.out.println(discussion.toString());
        discussRepository.save(discussion);
    }

    public List<Discussion> findAllDiscussion(){
        return discussRepository.findAll();
    }
}

