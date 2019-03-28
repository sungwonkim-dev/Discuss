package com.haja.discuss.web.user.repository;

import com.haja.discuss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyPageRepository extends JpaRepository<User,Long> {
}
