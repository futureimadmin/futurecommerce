package com.example.inventoryservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    // Constructors, Getters, Setters
}