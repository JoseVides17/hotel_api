package com.vides.hotel_api.dto.EventBooking;

import java.sql.Date;

import lombok.Data;

@Data
public class EventBookingRequest {

    private Long eventId;
    private Long clientId;
    private Date bookingDate;
    private Integer numberOfAttendees;
    private Float totalPrice;

}
