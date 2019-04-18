package com.haja.discuss.web.login.service;

import com.haja.discuss.DiscussRuntimeException;
import com.haja.discuss.entity.User;
import com.haja.discuss.web.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            User user = userRepository.findByUid(username);
            List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
            list.add(new SimpleGrantedAuthority(user.getRole()));
            UserDetails userDetails = new org.springframework.security.core.userdetails.User(username, user.getPassword(), list);
            return userDetails;
        } catch (Exception e) {
            throw e;
        }
    }

    public void createUserAccount(User user) throws Exception {
        try {
            if (userRepository.existsByUid(user.getUid()))
                throw new DiscussRuntimeException("your uid is already exist. Please enter another uid");
            User newUser = userRepository.save(user);
            if (newUser == null || newUser.getId() <= 0)
                throw new DiscussRuntimeException("Unknown ERROR. Please try again in a few minutes.");
        } catch (Exception e) {
            throw e;
        }
    }
}

