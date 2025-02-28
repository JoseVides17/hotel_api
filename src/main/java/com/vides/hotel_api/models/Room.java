package com.vides.hotel_api.models;

import com.vides.hotel_api.models.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String number;

    @Enumerated(EnumType.STRING)
    private RoomType type;

    @Column(nullable = false)
    private Integer capacity;

    private Float price;

    private String description;

    @Column(nullable = false)
    private Boolean available;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "roomItem")
    private List<InventoryItem> inventoryItems;

    @ManyToMany
    @JoinTable(name = "room_amenity",
        joinColumns = @JoinColumn(name = "room_id"),
        inverseJoinColumns = @JoinColumn(name = "amenity_id"))
    private List<Amenity> amenities;

    @ManyToMany
    @JoinTable(name = "room_inventory",
        joinColumns = @JoinColumn(name = "room_id"),
        inverseJoinColumns = @JoinColumn(name = "inventory_id"))
    private List<Inventory> inventories;

}
