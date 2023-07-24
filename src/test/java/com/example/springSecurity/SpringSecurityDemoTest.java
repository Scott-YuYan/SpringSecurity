package com.example.springSecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(classes = SpringSecurityApplication.class)
public class SpringSecurityDemoTest {

    @Test
    public void testDemo(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("123");
        System.out.println(encode);
        boolean matches = passwordEncoder.matches("123", encode);
        System.out.println(matches);
    }
}
