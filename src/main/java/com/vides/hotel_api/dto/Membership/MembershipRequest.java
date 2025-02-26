package com.vides.hotel_api.dto.Membership;

import java.sql.Date;

import lombok.Data;

@Data
public class MembershipRequest {

    private Integer membershipLevel;
    private Date startDate;
    private Date endDate;
    private Integer points;

}
