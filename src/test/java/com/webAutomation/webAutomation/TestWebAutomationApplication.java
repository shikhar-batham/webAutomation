package com.webAutomation.webAutomation;

import org.springframework.boot.SpringApplication;

public class TestWebAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.from(WebAutomationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
