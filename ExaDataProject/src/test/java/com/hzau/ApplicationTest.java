package com.hzau;

import com.hzau.Domain.User;
import com.hzau.Mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ApplicationTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testJunit(){
        System.out.println(1);
        System.out.println("Spring Boot 版本: " + SpringBootVersion.getVersion());
    }

    @Test
    public void testMapper(){
        List<User> users = userMapper.findAll();
        System.out.println(users);
    }
}
