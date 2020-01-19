package com.qf.furniture.user.center;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@SpringBootTest
class UserCenterApplicationTests {
    public static void main(String[] args) {
        Long uid = Long.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")));
        System.out.println(uid);
    }

    @Test
    void contextLoads() {
    }

}
