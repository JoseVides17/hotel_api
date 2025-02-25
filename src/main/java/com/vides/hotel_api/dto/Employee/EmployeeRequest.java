package com.vides.hotel_api.dto.Employee;

import lombok.Data;

@Data
public class EmployeeRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String position;
    private String department;

}
