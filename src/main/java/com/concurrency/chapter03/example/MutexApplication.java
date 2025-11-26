package com.concurrency.chapter03.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
public class MutexApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutexApplication.class, args);
	}

//	🔒 뮤텍스가 필요한 경우
//
//	1. 특정 주문번호에 대한 동시 결제 방지
//	2. 파일 업로드 시 메타데이터 업데이트 동시 수정 방지
//	3. 예약 시스템에서 중복 예약 방지 (동시성 충돌 방지)
	private void reentrantLock(){
		ReentrantLock reentrantLock = new ReentrantLock();
	}
}
