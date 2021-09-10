package com.techment.service;

import java.util.NoSuchElementException;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.UserDto;
import com.techment.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
@Autowired
UserRepository userRepository;

	@Override
	public UserDto login(String username, String password)throws NoSuchElementException {
    com.techment.entity.User user= userRepository.findByUsernameAndPassword(username, password).get();

      System.out.println(user.toString());
   System.out.println(user.getUsername()+"password"+user.getPassword());
   UserDto userDto= new UserDto(user.getUsername(), user.getPassword(),"shubhika");
		return userDto;
	}

}
