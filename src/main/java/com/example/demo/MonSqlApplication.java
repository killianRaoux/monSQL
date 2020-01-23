package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonSqlApplication {

	int a = 10;
	public static void main(String args[]) {
		SpringApplication.run(MonSqlApplication.class, args);
	}
	
	public void print() {
		int a = 8;
		System.out.println(a);
	}

}
