package com.isfong.spring.boot.apply.controller;

import com.isfong.spring.boot.apply.model.Permit;
import com.isfong.spring.boot.apply.service.PermitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping( "permits" )
@RequiredArgsConstructor
public class PermitController {

    private final PermitService service;

    @GetMapping
    public List< Permit > permits( ) {
        return service.list( );
    }

    @PostMapping( "create" )
    public Object create( @RequestBody Permit[] permits ) {
        return service.saveBatch( Arrays.asList( permits ) ) ? permits : false;
    }
}
