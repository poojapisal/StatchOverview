package com.erp.main.service;

import com.erp.main.model.User;

public interface UserService {


	void saveData(User user);

	Iterable<User> getAllData();

	void deleteUser(int userId);

	User getUserData(int userId);


}
