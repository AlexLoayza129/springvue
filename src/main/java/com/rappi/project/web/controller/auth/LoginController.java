package com.rappi.project.web.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rappi.project.entity.User;
import com.rappi.project.repository.UserRepository;

// Validate Origin
@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
public class LoginController {

    @Autowired
	private UserRepository userRepository;
    
    @PostMapping("/auth/user")
    public User authenticateUser(@RequestBody String email){
        return userRepository.findByEmail(email);
    }

}
