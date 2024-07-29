package com.banksystem.projeteventbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto {

    private  int id ;
    private String name;
    private String email;
    private String message;
}
