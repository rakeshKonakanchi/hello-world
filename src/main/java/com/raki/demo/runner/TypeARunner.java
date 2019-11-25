package com.raki.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(53)
public class TypeARunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("----From TypeARunner----");		
	}
}
