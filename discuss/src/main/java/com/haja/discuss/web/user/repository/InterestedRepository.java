package com.haja.discuss.web.user.repository;

import com.haja.discuss.entity.Count;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountRepository extends JpaRepository<Count, Long> {
    Count findByDid(Long did);
}
