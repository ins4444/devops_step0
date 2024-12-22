package kr.ac.koreatech.devops_step0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsStep0ApplicationTests {

	@Test
	void contextLoads() {
	}

	int add(int a, int b) {
		return a + b;
	}

	@Test
	void add_test1() {
		int result = add(a:10, b:20);
		assertEquals(expected:30, result);
	}	

	@Test
	void add_test2()) {
		int result = add(a:10, b:20);
		assertEquals(expected:10, result);
	}	

}
