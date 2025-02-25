package com.vides.hotel_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vides.hotel_api.models.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Reservation findByClientEmail(String email);
    Reservation findByRoomId(Long id);
    Reservation findByServiceId(Long id);
    Reservation findByEmployeeId(Long id);
}
