package com.banksystem.projeteventbackend.repository;

import com.banksystem.projeteventbackend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
