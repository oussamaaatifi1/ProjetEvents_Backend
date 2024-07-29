package com.banksystem.projeteventbackend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EventDto {
    private Long idEvent;
    private String eventName;
    private Date eventDate;
    private String location;
    private String category;
    private Double price;
}
