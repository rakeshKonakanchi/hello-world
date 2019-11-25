package com.raki.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
/*CommandLineRunner with Ordered implementations Manual Approach*/
public class MyTestRunner implements CommandLineRunner,Ordered{
@Override
	public void run(String... args) throws Exception {
		System.out.println("-----From MyTestRunner----");
	}
	@Override
	public int getOrder() {
		return 55;
	}
}
