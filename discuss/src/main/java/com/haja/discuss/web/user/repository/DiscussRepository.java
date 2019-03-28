package com.haja.discuss.web.user.repository;

import com.haja.discuss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscussRepository extends JpaRepository<User,Long> {
}
