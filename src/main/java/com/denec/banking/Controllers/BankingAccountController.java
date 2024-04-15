package com.denec.banking.Controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.denec.banking.DTO.TransferDTO;
import com.denec.banking.Repositories.UserRepository;

@RestController
public class BankingAccountController {
    private final UserRepository repository;

    public BankingAccountController(UserRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping("/money")
    public void signIn(@RequestBody TransferDTO transferDetails) {
        return;
    }

    @GetMapping("/money")
    public BigDecimal getMoney() {
        return new BigDecimal(0);
    }
}
