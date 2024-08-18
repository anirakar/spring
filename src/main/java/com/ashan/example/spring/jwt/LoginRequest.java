package com.ashan.example.spring.jwt;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;

@Getter @Setter
public class LoginRequest {
    private String username;
    private String password;
}
