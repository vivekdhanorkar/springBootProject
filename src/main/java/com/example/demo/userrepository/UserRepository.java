package com.example.demo.userrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.usermodel.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	

	
	
	

}
