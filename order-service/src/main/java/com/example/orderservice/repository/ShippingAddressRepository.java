package com.example.orderservice.repository;

import com.example.orderservice.model.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Long> {
}