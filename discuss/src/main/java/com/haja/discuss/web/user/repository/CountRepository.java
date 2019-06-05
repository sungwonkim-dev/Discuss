package com.haja.discuss.web.user.repository;

import com.haja.discuss.entity.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscussRepository extends JpaRepository<Discussion,Long> {
    Discussion findByDid(Long did);
}
