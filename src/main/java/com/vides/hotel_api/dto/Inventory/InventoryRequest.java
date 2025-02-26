package com.vides.hotel_api.dto.Inventory;

import java.sql.Date;

import lombok.Data;

@Data
public class InventoryRequest {

    private String name;
    private String description;
    private Integer quantity;
    private String unit;
    private Integer minimumStock;
    private Long supplierId;
    private Date lastOrderDate;

}
