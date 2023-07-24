package com.example.springSecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(classes = SpringSecurityApplication.class)
public class EncryptPasswordTest {

    @Test
    public void test(){
        PasswordEncoder passwordEncoder =  new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123"));
    }
}
