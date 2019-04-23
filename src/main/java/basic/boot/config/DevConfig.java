package basic.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import basic.boot.entity.BankAccount;

@Configuration
@Profile("development")
public class DevConfig {

   @Bean
   public BankAccount bankAccount() {
       return new BankAccount();
   }

}

