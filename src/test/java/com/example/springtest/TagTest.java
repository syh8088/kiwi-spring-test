package com.example.springtest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
