package com.banksystem.projeteventbackend.service;

import com.banksystem.projeteventbackend.model.Contact;
import com.banksystem.projeteventbackend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
        
    }

}
