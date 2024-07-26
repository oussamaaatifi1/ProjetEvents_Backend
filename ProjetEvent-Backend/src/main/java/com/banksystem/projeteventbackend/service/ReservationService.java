package com.banksystem.projeteventbackend.service;

import com.banksystem.projeteventbackend.model.Reservation;
import com.banksystem.projeteventbackend.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Long id, Reservation reservationDetails) {
        return reservationRepository.findById(id).map(reservation -> {
            reservation.setReservationDate(reservationDetails.getReservationDate());
            reservation.setNumTickets(reservationDetails.getNumTickets());
            reservation.setStatus(reservationDetails.getStatus());
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
