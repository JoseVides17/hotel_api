package com.vides.hotel_api.dto.Inventory;

import com.vides.hotel_api.models.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InventoryResponse {

    private String name;
    private Integer quantity;
    private String unit;
    private Integer minimumStock;
    private Supplier supplier;
    private String message;

}
