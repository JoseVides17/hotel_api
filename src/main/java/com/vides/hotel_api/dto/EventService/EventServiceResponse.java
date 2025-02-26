package com.vides.hotel_api.dto.EventService;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventServiceResponse {

    private String name;
    private String description;
    private Float price;
    private String message;

}
