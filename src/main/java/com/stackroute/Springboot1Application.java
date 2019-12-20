package com.stackroute;

import org.h2.security.auth.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Springboot1Application.class, args);
	}

}
