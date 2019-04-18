package com.haja.discuss.web.login.repository;

import com.haja.discuss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User    findByUid(String uid);
    boolean existsByUid(String uid);


}
