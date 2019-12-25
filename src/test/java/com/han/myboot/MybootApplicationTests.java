package com.han.myboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MybootApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    Date myDate;

    @Test
    public void test(){
        System.out.println(myDate);
    }
}
