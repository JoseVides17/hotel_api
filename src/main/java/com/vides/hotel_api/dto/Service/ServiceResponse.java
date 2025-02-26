package com.vides.hotel_api.dto.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServiceResponse {

    private String name;
    private Float price;
    private String message;

}
