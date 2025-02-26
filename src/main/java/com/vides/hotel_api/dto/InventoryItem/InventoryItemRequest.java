package com.vides.hotel_api.dto.InventoryItem;

import java.sql.Date;

import lombok.Data;

@Data
public class InventoryItemRequest {

    private String serialNumber;
    private Date purchaseDate;
    private String condition;
    private Long inventoryId;
    private Long roomId;

}
