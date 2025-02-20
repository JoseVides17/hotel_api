package com.vides.hotel_api.models;

import com.vides.hotel_api.models.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private Float totalPrice;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToMany
    @JoinTable(name = "reservation_service",
        joinColumns = @JoinColumn(name = "reservation_id"),
        inverseJoinColumns = @JoinColumn(name = "service_id"))
    private List<Service> services;

}
