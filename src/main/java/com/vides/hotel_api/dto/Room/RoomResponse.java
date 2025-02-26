package com.vides.hotel_api.dto.Room;

import com.vides.hotel_api.models.enums.RoomType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomResponse {

    private String number;
    private RoomType type;
    private Boolean available;
    private String message;

}
