package com.denec.banking.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.denec.banking.DTO.UserDTO;
import com.denec.banking.Models.User;
import com.denec.banking.Services.UserService;

@RestController
public class SignUpController {
    private final UserService service;

    public SignUpController(UserService service) {
        this.service = service;
    }
    
    @PostMapping("/signup")
    public User signUp(@RequestBody UserDTO registeringUser) {
        return service.registerNewUserAccount(registeringUser);
    }
}
