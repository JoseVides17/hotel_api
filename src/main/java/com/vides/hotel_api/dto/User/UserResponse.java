package com.vides.hotel_api.dto.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {

    private String username;
    private String role;
    private String message;

}
