package com.banksystem.projeteventbackend.controller;



import com.banksystem.projeteventbackend.service.EventService;
import com.banksystem.projeteventbackend.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/dashbord")
public class DashbordController {

    @Autowired
    private UserDetailsServiceImpl clientService;
    @Autowired
    private EventService eventService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/users")
    public Long countClients (){
        return clientService.countUsers();
    }

//    @PreAuthorize("hasRole('ADMIN')")
//    @GetMapping("/contacts")
//    public Long countContacts(){
//        return contactService.countAllContacts();
//    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/events")
    public Long countEvents(){
        return eventService.countEvents();
    }
}