package com.banksystem.projeteventbackend.config;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {


    private String username ;
    private String password ;

}
