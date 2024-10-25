package com.knowhow.service;

import com.knowhow.model.User;
import com.knowhow.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.knowhow.util.*;

@Service
public class UserService {
	
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listarUser() {
        return userRepository.findAll();
    }
    
    public Optional<User> listarUserPorId(Long id) {
        return userRepository.findById(id);
    }

    public User salvarUser(User user) {
    	String encryptedPassword = MD5Util.convertToMD5(user.getPassword());
        user.setPassword(encryptedPassword);
        return userRepository.save(user);
    }
	
}
