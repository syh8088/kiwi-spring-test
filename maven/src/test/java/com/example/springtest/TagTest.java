package com.example.springtest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@SpringBootTest
class TagTest {

    @Test
    //@Tag("fast")
    @FastTest
    void fast() {

    }

    @Test
    @Tag("slow")
    void slow() {

    }
}
