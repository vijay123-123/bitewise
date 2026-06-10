package com.supreme.bitewise_backend.service;

import com.supreme.bitewise_backend.model.UserPrinciple;
import com.supreme.bitewise_backend.model.Users;
import com.supreme.bitewise_backend.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UsersRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findUserByuserName(username);
        if(user==null) throw new UsernameNotFoundException("user not found");
        return new UserPrinciple(user);
    }

}
