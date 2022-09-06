package com.example.springtest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@SpringBootTest
class SpringTestApplicationTests {

	public static final String TEST_ENV = System.getenv("TEST_ENV");

	@BeforeAll
	static void beforeAll() {
	}

	@AfterAll
	static void afterAll() {
	}

	@BeforeEach
	void before() {
	}

	@AfterEach
	void after() {
	}

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("test")
	void test() {

		System.out.println("System.getenv(\"TEST_ENV\") = " + TEST_ENV);
		assumeTrue("Test ignored.".equalsIgnoreCase(TEST_ENV));

		assumingThat("test".equalsIgnoreCase(TEST_ENV), () -> {

		});
	}

	@Test
	@EnabledOnOs({OS.MAC, OS.WINDOWS })
	// @DisabledOnOs(OS.MAC)
	void os() {

	}

}
