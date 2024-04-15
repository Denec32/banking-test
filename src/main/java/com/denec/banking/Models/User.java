package com.denec.banking.Models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    Long id;
    String username;
    String password;
    BigDecimal money;
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
