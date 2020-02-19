package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String quick() {
        return "SpringBoot Succeed";
    }

    @RequestMapping("/queryUser")
    public List<User> queryUser() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
