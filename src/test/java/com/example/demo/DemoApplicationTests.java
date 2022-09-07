package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Map<String, String> env = System.getenv();
		env.forEach((k, v) -> System.out.println(k + ":" + v));

		String keystore_password = System.getenv("DAF_KEYSTORE_PASSWORD");
		System.out.println(keystore_password.equals("FOOBARBAZ!#%&987654321"));
	}
}
