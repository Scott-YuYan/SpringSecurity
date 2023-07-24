package com.example.springSecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springSecurity.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
}

