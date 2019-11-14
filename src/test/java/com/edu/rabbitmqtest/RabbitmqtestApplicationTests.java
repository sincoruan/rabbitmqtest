package com.edu.rabbitmqtest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RabbitmqtestApplicationTests {

	@Autowired
	private Sender sender;

	@Test
	void test() {
		this.sender.send("hellor rabbit");
	}

}
