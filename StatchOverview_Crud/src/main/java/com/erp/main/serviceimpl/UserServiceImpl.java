package com.erp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.main.model.User;
import com.erp.main.repository.UserRepository;
import com.erp.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	UserRepository userRepository;
	
	@Override
	public void saveData(User user) {
		userRepository.save(user);
		
	}

	@Override
	public Iterable<User> getAllData() {
		// TODO Auto-generated method stub
		return userRepository.findAll();

	}
	
	
	@Override
	public void deleteUser(int userId) 
	{
		
		userRepository.deleteById(userId);
		
	}

	@Override
	public User getUserData(int userId) 
	{
		
		return (User) userRepository.finduserId(userId);

	}

}
