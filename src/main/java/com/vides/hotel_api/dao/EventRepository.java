package com.vides.hotel_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vides.hotel_api.models.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
