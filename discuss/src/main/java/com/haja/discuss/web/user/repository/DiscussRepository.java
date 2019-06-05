package com.haja.discuss.web.user.repository;

import com.haja.discuss.entity.Discussion;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface DiscussRepository extends JpaRepository<Discussion, Long> {
    Discussion findByDid(Long did);
    List<Discussion> findFirst10ByCreatedBetween(Date start, Date end, Sort sort);
    List<Discussion> findAllByDidIn(Set<Long> dids);
}
