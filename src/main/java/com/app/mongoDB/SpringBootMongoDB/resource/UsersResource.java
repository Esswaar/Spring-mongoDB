package com.app.mongoDB.SpringBootMongoDB.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mongoDB.SpringBootMongoDB.document.Users;
import com.app.mongoDB.SpringBootMongoDB.repository.UsersRepository;

@RequestMapping("/rest/users")
@RestController
public class UsersResource {
	
	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping("/all")
	public List<Users> getUsers(){
		return usersRepository.findAll();
	}

}
