package com.ufg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ufg.repository")
@EntityScan("com.ufg.model")
@SpringBootApplication

public class LivrosApplication {
	public static void main(String[] args) {
		SpringApplication.run(LivrosApplication.class, args);
	}
}
