package com.banksystem.projeteventbackend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class ReservationDto {

    private Long idReservation;
    private Date reservationDate;
    private int numTickets;
    private String status;
}
