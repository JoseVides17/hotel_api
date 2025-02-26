package com.vides.hotel_api.dto.EventBooking;

import java.sql.Date;

import com.vides.hotel_api.models.Client;
import com.vides.hotel_api.models.Event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventBookngResponse {

    private Event event;
    private Client clientBooking;
    private Date bookingDate;
    private String message;

}
