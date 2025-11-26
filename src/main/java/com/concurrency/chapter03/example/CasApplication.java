package com.concurrency.chapter03.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasApplication.class, args);
	}

	// Compare And Swap
	// 락킹(synchronized)은 내부적으로 monitor lock을 잡기 때문에
	//	이 말은:
	//	1.스레드가 lock을 얻기 위해 대기(queue)
	//	2.CPU context switching 발생
	//	3.OS 수준의 락 관리 비용 발생
	//	4.즉 스레드가 실제로 기다리기 때문에 비용이 크다.
	// -> 비용이 많이 들기 때문에 cas가 탄생
	private void cas(){

	}
}
