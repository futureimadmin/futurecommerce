package com.example.orderservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shipping_addresses")
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    // Constructors, Getters, Setters
}