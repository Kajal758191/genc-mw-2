package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MyApplicationStarter  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MyApplicationStarter.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("[][][][][][][]");
		System.out.println("[][][][][][][]");
		System.out.println("[][][][][][][]");
		System.out.println("[][][][][][][]");
		System.out.println("[][][][][][][]");
		System.out.println("[][][][][][][]");
	}
}

