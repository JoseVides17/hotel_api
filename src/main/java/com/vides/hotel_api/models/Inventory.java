package com.vides.hotel_api.models;

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
@Table(name = "inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Integer quantity;

    private String unit;

    private Integer minimumStock;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @Temporal(TemporalType.DATE)
    private Date lastOrderDate;

    @ManyToMany(mappedBy = "inventories")
    private List<Room> rooms;

    @OneToMany(mappedBy = "inventory")
    private List<InventoryItem> inventoryItems;

}
