package com.example.demo.userservicetest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.usermodel.User;
import com.example.demo.userrepository.UserRepository;
import com.example.demo.userservice.UserService;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService us;

	@Autowired
	private UserRepository ur;

	User u = new User();

	/*
	 * @Test public void testSaveUserData() {
	 * 
	 * u.setId(2); u.setUserId(102); u.setUserName("Anurag Dhanorkar");
	 * u.setUserMobNo(7875324821l); u.setUserSalary(47500);
	 * 
	 * 
	 * us.saveUserData(u);
	 * 
	 * }
	 */

	@Test
	public void testGetUserDetails() {

		us.getUserDetails(1);

	}

}
