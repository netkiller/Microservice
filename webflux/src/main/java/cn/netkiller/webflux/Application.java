package cn.netkiller.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		System.out.println("Webflux!");
		SpringApplication.run(Application.class, args);
	}

}
