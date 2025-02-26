package com.vides.hotel_api.dto.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SupplierResponse {

    private String name;
    private String contactInformation;
    private String message;

}
