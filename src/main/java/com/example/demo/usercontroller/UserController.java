package com.example.demo.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.usermodel.User;
import com.example.demo.userservice.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService us;
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> userData(@RequestBody User u){

		return new ResponseEntity<User>(us.saveUserData(u),HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getData(@PathVariable ("id") int id){
		
		return new ResponseEntity<User>(us.getUserDetails(id),HttpStatus.OK);
		
	}
	
	

}
