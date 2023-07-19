package com.project.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.user.model.User;
import com.project.user.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;

	public User findUserById(int id) {
		Optional<User> result = userrepository.findById(id);
		User user=result.get();
		return user;
	}

	public List<User> getAlluser() {
		
		return userrepository.findAll();
	}

	public void addUser(User user) {
		
		userrepository.save(user);
	}

	public void deleteUserById(int id) {
		
		userrepository.deleteById(id);
		
	}

	public void updateUser(User user) {
		Optional<User> result = userrepository.findById(user.getU_id());
		result.get().setU_name(user.getU_name());
		result.get().setU_email(user.getU_email());
		result.get().setU_password(user.getU_password());
		result.get().setU_role(user.getU_role());
		userrepository.save(user);
		
	}


}
