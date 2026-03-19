package org.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfigration(자동설정) : 프로젝트에 추가한 jar를 자동 설정한다.
//@ComponentScan(클래스 스캔) : 해당 어노테이션이 위치한 패키지와 하위 패키지를 스캔해서 클래스를 찾아 Bean을 등록한다.
@SpringBootApplication
public class Spring0306Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring0306Application.class, args);
	}

}
