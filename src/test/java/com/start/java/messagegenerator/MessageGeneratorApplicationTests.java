package com.start.java.messagegenerator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageGeneratorApplicationTests {

	@Test
	void contextLoads() {
		String name = "Rafael";
		String lastName = "Freitas";
		System.out.println("Olá Mundo!" + name + " " + lastName);
	}

}
