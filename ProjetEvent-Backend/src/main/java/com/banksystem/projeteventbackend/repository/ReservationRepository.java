package com.banksystem.projeteventbackend.repository;


import com.banksystem.projeteventbackend.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    // Custom query method to find a reservation by its ID
    Optional<Reservation> findById(Long id);

    // Add more query methods as needed
}
