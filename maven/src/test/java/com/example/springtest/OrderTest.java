package com.example.springtest;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTest {

    @Test
    @Order(2)
    void test() {
        System.out.println("this = " + this);
    }

    @Test
    @Order(1)
    void test2() {
        System.out.println("this2 = " + this);
    }
}
