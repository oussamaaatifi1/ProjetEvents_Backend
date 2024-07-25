package com.banksystem.projeteventbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor @Getter @Setter
public class Billet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_billet;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private   User user;

    @ManyToOne
    @JoinColumn(name ="id")
    private  Event event;


}
