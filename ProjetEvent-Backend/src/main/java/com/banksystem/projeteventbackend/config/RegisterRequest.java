package com.banksystem.projeteventbackend.config;

import com.banksystem.projeteventbackend.model.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String nom;
    private String username;
    private String password;
    private Role role;
}