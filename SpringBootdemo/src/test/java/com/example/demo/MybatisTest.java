package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void queryUser() {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setUname("大哥成龙");
        user.setPassword("123456789");
        user.setSex("男");
        userMapper.insertUser(user);
    }
}
