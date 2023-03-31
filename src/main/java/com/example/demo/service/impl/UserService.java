package com.example.demo.service.impl;

import com.example.demo.model.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements IUserService {

//    @Autowired
//    UserRepository userRepository;

    @Override
    public User getUserById(long id) {
        return null;
    }
}
