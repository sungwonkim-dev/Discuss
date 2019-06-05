package com.haja.discuss.web.user.repository;

import com.haja.discuss.entity.Interested;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterestedRepository extends JpaRepository<Interested, Long> {
    List<Interested> findAllByUid(Long uid);
}
