package com.example.springSecurity.service;

import com.example.springSecurity.model.ResponseResult;
import com.example.springSecurity.model.User;

public interface LoginService {


    /**
     * 注册
     */
    ResponseResult<User> register(User user);

    /**
     * 登陆
     */
    ResponseResult<User> login(User user);

    /**
     * 登出
     * @return
     */
    ResponseResult logout();
}
