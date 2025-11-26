package com.concurrency.chapter03.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

@SpringBootApplication
public class CountDownLatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountDownLatchApplication.class, args);
	}

	private void countDownLatch(){
		CountDownLatch semaphore = new CountDownLatch(1);

	}
}
