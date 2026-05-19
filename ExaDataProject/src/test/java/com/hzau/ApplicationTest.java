package com.hzau;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {

    @Test
    public void testJunit(){
        System.out.println(1);
        System.out.println("Spring Boot 版本: " + SpringBootVersion.getVersion());
    }
}
