package com.erp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.main.model.User;
import com.erp.main.repository.UserRepository;
import com.erp.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository ur;
	
	@Override
	public void saveData(User user) {
		ur.save(user);
		
	}

	@Override
	public Iterable<User> getAllData() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

}
