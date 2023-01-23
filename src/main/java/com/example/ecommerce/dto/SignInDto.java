package com.example.ecommerce.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SignInDto {
    private String username;
    private String password;
}
