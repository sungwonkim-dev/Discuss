package com.haja.discuss.web.admin.repository;

import com.haja.discuss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<User,Long> {
}
