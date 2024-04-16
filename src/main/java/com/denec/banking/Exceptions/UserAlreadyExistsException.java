package com.denec.banking.Exceptions;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String username) {
        super("Username " + username + " is already taken. Please input a new one");
    }
}
