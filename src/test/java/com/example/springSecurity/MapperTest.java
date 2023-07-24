package com.example.springSecurity;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springSecurity.mapper.UserMapper;
import com.example.springSecurity.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

/**
 * @Author 三更  B站： https://space.bilibili.com/663528522
 */
@SpringBootTest(classes = SpringSecurityApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}

