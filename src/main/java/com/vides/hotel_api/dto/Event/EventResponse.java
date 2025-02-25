package com.vides.hotel_api.dto.Event;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventResponse {

    private String name;
    private Date startDate;
    private Date endDate;
    private String message;

}
