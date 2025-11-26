package com.concurrency.chapter02.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcurrencyApplication {

	public static void main(String[] args) {
		sleep();
		SpringApplication.run(ConcurrencyApplication.class, args);
	}

	private static void sleep(){
		Thread thread1 = new Thread(() -> {
			try {
				Thread.sleep(1000); // 1초 재우기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Test: " + Thread.currentThread().getName());
		});
		thread1.start(); //스레드 실행

		System.out.println("Main Test: " + Thread.currentThread().getName()); // main 스레드
	}
}
