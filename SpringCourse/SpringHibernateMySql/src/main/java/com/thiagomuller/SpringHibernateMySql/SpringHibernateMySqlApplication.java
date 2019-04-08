package com.thiagomuller.SpringHibernateMySql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringHibernateMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateMySqlApplication.class, args);
	}

}
