package com.sl.cupid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CupidApplication {

	public static void main(String[] args) {
		SpringApplication.run(CupidApplication.class, args);
	}

}
