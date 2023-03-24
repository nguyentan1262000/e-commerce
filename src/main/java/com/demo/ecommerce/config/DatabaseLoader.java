package com.demo.ecommerce.config;

import com.demo.ecommerce.entity.Role;
import com.demo.ecommerce.entity.User;
import com.demo.ecommerce.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseLoader {
    private UserRepository repository;

    public DatabaseLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Bean
    public CommandLineRunner initDatabase(){
        return args -> {
            User user1 = new User("phanhieu","hieu@gmail.com","hieu123", Role.USER);
            User user2 = new User("admin","admin@gmail.com","1111", Role.ADMIN);
            User user3 = new User("user","user@gmail.com","1", Role.USER);

            repository.saveAll(List.of(user1,user2,user3));
            System.out.println("Initialized Database!!!!");
        };
    }
}
