package com.example.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// HTTP Status code
// 2XX -> OK
// 4XX -> Client 쪽 오류
// 5XX -> Server 쪽 오류
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
