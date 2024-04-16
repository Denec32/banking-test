package com.denec.banking.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.denec.banking.DTO.UserDTO;
import com.denec.banking.Models.User;
import com.denec.banking.Repositories.UserRepository;

@RestController
public class SignInController {
    private final UserRepository repository;

    public SignInController(UserRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping("/signin")
    public void signIn(@RequestBody UserDTO registeringUser) {

    }
}
