package com.banksystem.projeteventbackend.service;

import com.banksystem.projeteventbackend.model.Event;
import com.banksystem.projeteventbackend.model.Reservation;
import com.banksystem.projeteventbackend.model.User;
import com.banksystem.projeteventbackend.repository.EventRepository;
import com.banksystem.projeteventbackend.repository.ReservationRepository;
import com.banksystem.projeteventbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation createReservation(Reservation reservation) {
        User user = userRepository.findById(reservation.getUser().getId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        Event event = eventRepository.findById(reservation.getEvent().getIdEvent())
                .orElseThrow(() -> new RuntimeException("Event not found"));

        reservation.setUser(user);
        reservation.setEvent(event);
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Long id, Reservation reservationDetails) {
        return reservationRepository.findById(id).map(reservation -> {
            reservation.setReservationDate(reservationDetails.getReservationDate());
            reservation.setNumTickets(reservationDetails.getNumTickets());
            reservation.setStatus(reservationDetails.getStatus());
            reservation.setUser(reservationDetails.getUser());
            reservation.setEvent(reservationDetails.getEvent());
            return reservationRepository.save(reservation);
        }).orElse(null);
    }

    public boolean deleteReservation(Long id) {
        return reservationRepository.findById(id).map(reservation -> {
            reservationRepository.delete(reservation);
            return true;
        }).orElse(false);
    }
}
