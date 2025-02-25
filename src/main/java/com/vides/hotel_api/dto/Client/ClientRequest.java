package com.vides.hotel_api.dto.Client;

import lombok.Data;

@Data
public class ClientRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;

}
