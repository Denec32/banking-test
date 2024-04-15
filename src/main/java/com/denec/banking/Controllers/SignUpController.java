package com.denec.banking.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.denec.banking.DTO.UserDTO;
import com.denec.banking.Repositories.UserRepository;

@RestController
public class SignUpController {
    private final UserRepository repository;

    public SignUpController(UserRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping("/signup")
    public void signUp(@RequestBody UserDTO registeringUser) {
        return;
    }

}
