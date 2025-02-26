package com.vides.hotel_api.dto.InventoryItem;

import com.vides.hotel_api.models.Inventory;
import com.vides.hotel_api.models.Room;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InventoryItemResponse {

    private String serialNumber;
    private String condition;
    private Inventory inventory;
    private Room room;
    private String message;

}
