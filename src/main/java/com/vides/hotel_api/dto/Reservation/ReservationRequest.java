package com.vides.hotel_api.dto.Reservation;

import java.sql.Date;

import com.vides.hotel_api.models.enums.ReservationStatus;

import lombok.Data;

@Data
public class ReservationRequest {

    private Date startDate;
    private Date endDate;
    private Float totalPrice;
    private ReservationStatus status;
    private Long clientId;
    private Long roomId;
    private Long employeeId;

}
