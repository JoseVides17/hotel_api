package com.vides.hotel_api.dto.Reservation;

import com.vides.hotel_api.models.enums.ReservationStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationResponse {

    private ReservationStatus status;
    private String message;

}
