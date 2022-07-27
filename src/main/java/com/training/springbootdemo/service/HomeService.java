package com.training.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springbootdemo.model.User;
import com.training.springbootdemo.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	HomeRepository repo;
	
	public boolean isValid(String uname, String pwd) {
		System.out.println("from page: "+uname+":"+pwd);
		List<User> users = repo.findAll();
		boolean valid = false;
		for(User usr:users) {
			System.out.println(usr.getUserName()+":"+usr.getPassword());
			if(uname.equals(usr.getUserName()) && pwd.equals(usr.getPassword())){
				valid = true;
			}
			
		}
		
		return valid;
		
	}

}
