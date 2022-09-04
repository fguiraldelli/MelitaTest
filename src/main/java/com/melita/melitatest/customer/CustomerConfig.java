package com.melita.melitatest.customer;

import java.time.LocalDate;
import java.time.Month;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
  
  @Bean
  CommandLineRunner commandLineRunner(CustomerRepository repository) {
    return args -> {
      Customer customer = new Customer(
        "John Doe",
        "johndoe@mail.com",
        "homer street, 25 - Downtown",
        LocalDate.of(1988, Month.AUGUST, 29)
      );
      repository.save(
        customer
      );
    };
  }

}
