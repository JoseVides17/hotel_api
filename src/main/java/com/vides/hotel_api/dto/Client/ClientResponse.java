package com.vides.hotel_api.dto.Client;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientResponse {

    private String firstName;
    private String lastName;
    private String message;

}
