package com.vides.hotel_api.dto.Amenity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AmenityResponse {

    private String name;
    private Float price;
    private String message;

}
