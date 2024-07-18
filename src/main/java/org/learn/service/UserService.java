package org.learn.service;

import org.learn.entity.User;
import org.learn.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void adduser(){

        User s = new User(1L,"Hem","Pithoragarh",7534868979L,"Graduate");

        userRepository.save(s);

    }
}
