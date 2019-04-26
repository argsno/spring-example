package com.argsno.springbootweb.web;

import com.argsno.springbootweb.model.User;
import com.argsno.springbootweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    public User getUser() {
        User user = userRepository.findByUserName("aa");
        System.out.println(user);
        return user;
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
        return users;
    }
}
