package com.vides.hotel_api.dto.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeResponse {

    private String firstName;
    private String lastName;
    private String message;

}
