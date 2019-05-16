package com.isfong.spring.boot.apply.controller;

import com.isfong.spring.boot.apply.model.User;
import com.isfong.spring.boot.apply.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "users" )
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List< User > users( ) {
        return service.list( );
    }
}
