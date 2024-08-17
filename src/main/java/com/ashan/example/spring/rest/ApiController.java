package com.ashan.example.spring.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class ApiController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome from server!!</h1>";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userApi() {
        return "<h1>Welcome User!!</h1>";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminApi() {
        return "<h1>Welcome Admin!!</h1>";
    }
}
