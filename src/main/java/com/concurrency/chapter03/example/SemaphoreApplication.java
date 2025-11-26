package com.concurrency.chapter03.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
public class SemaphoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemaphoreApplication.class, args);
	}

//	🚦 세마포어가 필요한 경우
//
//	1. 한 API 엔드포인트가 동시 10개 요청까지만 허용
//	2. 외부 API 호출이 QPS 제한이 있다면 동시 요청 제한
//	3. 특정 자원을 가진 워커가 3개라면 동시 3개 작업만 처리
	private void semaphore(){
		Semaphore semaphore = new Semaphore(1);
		final Object lock = new Object();
		synchronized (lock) {
			//
		}
	}
}
