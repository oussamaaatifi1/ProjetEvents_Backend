package com.banksystem.projeteventbackend.service;

import com.banksystem.projeteventbackend.model.Event;
import com.banksystem.projeteventbackend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event eventDetails) {
        return eventRepository.findById(id).map(event -> {
            event.setEventName(eventDetails.getEventName());
            event.setEventDate(eventDetails.getEventDate());
            event.setLocation(eventDetails.getLocation());
            event.setCategory(eventDetails.getCategory());
            event.setPrice(eventDetails.getPrice());
            return eventRepository.save(event);
        }).orElse(null);
    }

    public boolean deleteEvent(Long id) {
        return eventRepository.findById(id).map(event -> {
            eventRepository.delete(event);
            return true;
        }).orElse(false);
    }
    public Long countEvents() {
        return  eventRepository.countEvents();
    }
}
