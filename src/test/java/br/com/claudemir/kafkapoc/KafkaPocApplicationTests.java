package br.com.claudemir.kafkapoc;

import br.com.claudemir.kafkapoc.controller.CarController;
import br.com.claudemir.kafkapoc.controller.CarDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaPocApplicationTests {

	@Autowired
	private CarController controller;

	@Test
	void contextLoads() {
		System.out.println("0000000000000000000000000");
		controller.create(CarDTO.builder().model("teste").color("azul").build());
	}

}
