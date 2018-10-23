package com.app.mongoDB.SpringBootMongoDB.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.app.mongoDB.SpringBootMongoDB.document.Users;
import com.app.mongoDB.SpringBootMongoDB.repository.UsersRepository;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UsersRepository usersRepository){
		return strings -> {
			usersRepository.save(new Users(100, "Eswar", "Rangera", 200L));
			usersRepository.save(new Users(200, "Sai", "Mutants", 100L));
		};
	}
	

}
