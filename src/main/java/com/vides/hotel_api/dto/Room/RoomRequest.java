package com.vides.hotel_api.dto.Room;

import com.vides.hotel_api.models.enums.RoomType;

import lombok.Data;

@Data
public class RoomRequest {

    private String number;
    private RoomType type;
    private Integer capacity;
    private Float price;
    private String description;
    private Boolean available;

}
