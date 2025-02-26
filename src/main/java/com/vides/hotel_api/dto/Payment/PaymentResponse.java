package com.vides.hotel_api.dto.Payment;

import com.vides.hotel_api.models.enums.PaymentMethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentResponse {

    private Float amount;
    private String paymentDate;
    private PaymentMethod paymentMethod;
    private String transactionId;
    private String message;

}
