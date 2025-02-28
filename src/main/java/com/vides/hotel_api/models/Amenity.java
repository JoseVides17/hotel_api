package com.vides.hotel_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "amenities")
public class Amenity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String description;

    private Float price;

    @ManyToMany(mappedBy = "amenities")
    private List<Room> rooms;

    @ManyToMany(mappedBy = "amenitiesReservation")
    private List<Reservation> reservations;
}
