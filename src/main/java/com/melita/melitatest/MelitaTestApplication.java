package com.melita.melitatest;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@EnableRabbit
@SpringBootApplication
public class MelitaTestApplication {

	//TODO: This Bean is used only for develop purposes to access H2 database
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/h2-console/**");
	}

	public static void main(String[] args) {
		SpringApplication.run(MelitaTestApplication.class, args);
	}

}
