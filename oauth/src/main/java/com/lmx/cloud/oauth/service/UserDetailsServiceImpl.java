package com.lmx.cloud.oauth.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author: lmx
 * @create: 2020/7/20
 **/
@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        log.info("user name is :{}", name);
        UserDetails userDetails = User.withUsername("admin").password(passwordEncoder.encode("123456")).authorities("p1").build();
        return userDetails;
    }
}
