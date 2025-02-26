package com.vides.hotel_api.dto.Payment;

import java.sql.Date;

import com.vides.hotel_api.models.enums.PaymentMethod;

import lombok.Data;

@Data
public class PaymentRequest {

    private Float amount;
    private Date paymentDate;
    private PaymentMethod paymentMethod;
    private String transactionId;
    private Long reservationId;

}
