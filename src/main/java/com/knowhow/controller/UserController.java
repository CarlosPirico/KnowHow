package com.knowhow.controller;

import com.knowhow.model.User;
import com.knowhow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
	   private final UserService userService;

	    @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping()
	    public List<User> listarSubjects() {
	        return userService.listarUser();
	    }
	    
	    @GetMapping(path="/{id}", produces = "application/json")
	    public Optional<User> listarSubjectsPorId(@PathVariable("id") Long id) {
	        return userService.listarUserPorId(id);
	    }

	    @PostMapping()
	    public User criarSubject(@RequestBody User user) {
	        return userService.salvarUser(user);
	    }
}
