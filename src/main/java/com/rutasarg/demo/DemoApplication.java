package com.rutasarg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		out.println("█▀▀ █░█ █▄░█ █▀▀ █ █▀█ █▄░█ ▄▀█ █▄░█ █▀▄ █▀█");
		out.println("█▀░ █▄█ █░▀█ █▄▄ █ █▄█ █░▀█ █▀█ █░▀█ █▄▀ █▄█");
	}

}
