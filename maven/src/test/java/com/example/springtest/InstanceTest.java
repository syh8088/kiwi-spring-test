package com.example.springtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InstanceTest {

    @Test
    void test() {
        System.out.println("this = " + this);
    }

    @Test
    void test2() {
        System.out.println("this2 = " + this);
    }
}
