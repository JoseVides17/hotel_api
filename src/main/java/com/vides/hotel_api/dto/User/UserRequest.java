package com.vides.hotel_api.dto.User;

import lombok.Data;

@Data
public class UserRequest {

    private String username;
    private String password;
    private String role;

}
