package com.vides.hotel_api.dto.Membership;

import java.sql.Date;
import java.util.List;

import com.vides.hotel_api.models.Client;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MembershipResponse {

    private List<Client> clients;
    private Integer membershipLevel;
    private Date startDate;
    private Date endDate;
    private Integer points;
    private String message;

}
