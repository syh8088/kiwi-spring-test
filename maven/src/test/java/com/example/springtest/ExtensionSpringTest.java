package com.example.springtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 오래 걸리는 TEST 를 찾아서 @SlowTest 안붙어 있으면 print 출력 해보자(권장해보는)
 */

// 선언적인 등록
//@ExtendWith(FindSlowTestExtension.class)
@SpringBootTest
public class ExtensionSpringTest {

    // 프로그래밍 등록
    @RegisterExtension
    static FindSlowTestExtension findSlowTestExtension = new FindSlowTestExtension(1000L);

    @Test
    public void test1() {

    }

   // @SlowTest
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(1005L);
    }

    @Test
    public void test3() {
        assertEquals(1, 2);
    }
}
