package com.example.springSecurity.controller;

import com.example.springSecurity.model.ResponseResult;
import com.example.springSecurity.model.User;
import com.example.springSecurity.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/register")
    public ResponseResult<User> register(@RequestBody User user){
        return loginService.register(user);
    }

    @PostMapping("/login")
    public ResponseResult<User> login(@RequestBody User user){
        return loginService.login(user);
    }

    @PostMapping("/hello")
    @PreAuthorize("hasAuthority('test')")
    public ResponseResult<String> hello(){
        return new ResponseResult<>(200,"hello");
    }


    @PostMapping(value = "/logout")
    public ResponseResult<String> logout(){
        return new ResponseResult<>(200,"hello");
    }
}
