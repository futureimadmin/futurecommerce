package com.example.inventoryservice.service;

import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.model.Product;
import com.example.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public Inventory updateInventory(Long productId, int quantity) {
        Optional<Inventory> existingInventory = inventoryRepository.findById(productId);
        if (existingInventory.isPresent()) {
            Inventory inventory = existingInventory.get();
            inventory.setQuantity(quantity);
            return inventoryRepository.save(inventory);
        } else {
            return null; // Or throw an exception
        }
    }

    public void deleteInventory(Long productId) {
        inventoryRepository.deleteById(productId);
    }

    public Optional<Inventory> getInventoryById(Long productId) {
        return inventoryRepository.findById(productId);
    }

    public List<Inventory> getAllInventories() {
        return inventoryRepository.findAll();
    }

    // Assuming you have a Product entity and a way to link it to Inventory
    public List<Inventory> getInventoryByCategory(Long categoryId) {
        // This would require a more complex query, possibly using a custom method in the repository
        // For simplicity, I'm leaving it as a placeholder
        return null;
    }

    public Inventory addInventoryCategory(Long productId, Long categoryId) {
        // This would involve linking a product to a category, which might be handled in the ProductCatalogService
        // For simplicity, I'm leaving it as a placeholder
        return null;
    }
}