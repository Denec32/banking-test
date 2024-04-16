package com.denec.banking.Models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "users")
public class User {
    @Id
    Long id;
    String username;
    String encryptedPassword;
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

    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
