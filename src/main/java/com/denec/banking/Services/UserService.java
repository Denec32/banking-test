package com.denec.banking.Services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.denec.banking.DTO.UserDTO;
import com.denec.banking.Exceptions.UserAlreadyExistsException;
import com.denec.banking.Models.User;
import com.denec.banking.Repositories.UserRepository;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repository;

    public User registerNewUserAccount(UserDTO registeringUser) {
        if (usernameAlreadyTaken(registeringUser.getLogin())) {
            throw new UserAlreadyExistsException(registeringUser.getLogin());
        } else {
            User user = new User();
            user.setUsername(registeringUser.getLogin());
            PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
            String encodedPassword = passwordEncoder.encode(registeringUser.getPassword());
            user.setEncryptedPassword(encodedPassword);
            user.setMoney(new BigDecimal(0));
            repository.save(user);
            return user;
        }
    }

    public boolean usernameAlreadyTaken(String username) {
        return repository.findByUsername(username) != null;
    }
}
