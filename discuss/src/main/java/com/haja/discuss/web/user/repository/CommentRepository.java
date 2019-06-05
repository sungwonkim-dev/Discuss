package com.haja.discuss.web.user.repository;

import com.haja.discuss.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByDid(Long did);
}
