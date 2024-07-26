package com.banksystem.projeteventbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  int id ;
private String name;
private String email;
private String message;
}
