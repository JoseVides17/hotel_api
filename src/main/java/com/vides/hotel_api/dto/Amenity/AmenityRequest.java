package com.vides.hotel_api.dto.Amenity;

import lombok.Data;

@Data
public class AmenityRequest {

    private String name;
    private String  description;
    private Float price;

}
