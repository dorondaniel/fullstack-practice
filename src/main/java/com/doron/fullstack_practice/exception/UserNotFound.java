package com.doron.fullstack_practice.exception;

public class UserNotFound extends RuntimeException {
    public UserNotFound(Long id){
        super("User Not found with ID: "+ id);
    }
}
