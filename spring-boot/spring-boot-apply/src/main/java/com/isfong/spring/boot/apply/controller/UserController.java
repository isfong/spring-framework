package com.isfong.spring.boot.apply.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.isfong.spring.boot.apply.model.User;
import com.isfong.spring.boot.apply.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "users" )
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public IPage< User > users( ) {
        return service.page( new Page< User >( ).setCurrent( 1 ).setSize( 10 ) );
    }

    @PostMapping( "sign-in" )
    public User sign_in( String username, String password ) {
        return service.getOne( new QueryWrapper< User >( ).eq( "username", username ).eq( "password", password ) );
    }
}
