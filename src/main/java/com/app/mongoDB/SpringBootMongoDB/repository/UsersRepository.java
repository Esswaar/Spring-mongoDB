package com.app.mongoDB.SpringBootMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.mongoDB.SpringBootMongoDB.document.Users;

public interface UsersRepository extends MongoRepository<Users, Integer>{

}
