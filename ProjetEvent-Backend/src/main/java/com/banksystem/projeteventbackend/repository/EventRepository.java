package com.banksystem.projeteventbackend.repository;

import com.banksystem.projeteventbackend.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
