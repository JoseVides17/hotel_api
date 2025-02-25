package com.vides.hotel_api.dto.Event;

import java.sql.Date;

import lombok.Data;

@Data
public class EventRequest {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private String location;
    private Integer capacity;

}
