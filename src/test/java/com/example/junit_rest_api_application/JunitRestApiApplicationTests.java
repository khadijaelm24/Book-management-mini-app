package com.example.junit_rest_api_application;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitRestApiApplicationTests {

	@Test 
	public void demoTestMethod(){
		assertTrue(true);
	}

}
