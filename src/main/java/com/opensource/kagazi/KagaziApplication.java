package com.opensource.kagazi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.opensource.kagazi.model")
@EnableJpaRepositories("com.opensource.kagazi.repository")
public class KagaziApplication {

	public static void main(String[] args) {
		SpringApplication.run(KagaziApplication.class, args);
	}
}
