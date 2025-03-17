package com.example.inventoryservice.controller;

import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public Inventory addInventory(@RequestBody Inventory inventory) {
        return inventoryService.addInventory(inventory);
    }

    @PutMapping("/{productId}")
    public Inventory updateInventory(@PathVariable Long productId, @RequestParam int quantity) {
        return inventoryService.updateInventory(productId, quantity);
    }

    @DeleteMapping("/{productId}")
    public void deleteInventory(@PathVariable Long productId) {
        inventoryService.deleteInventory(productId);
    }

    @GetMapping("/{productId}")
    public Optional<Inventory> getInventoryById(@PathVariable Long productId) {
        return inventoryService.getInventoryById(productId);
    }

    @GetMapping
    public List<Inventory> getAllInventories() {
        return inventoryService.getAllInventories();
    }

    @GetMapping("/category/{categoryId}")
    public List<Inventory> getInventoryByCategory(@PathVariable Long categoryId) {
        return inventoryService.getInventoryByCategory(categoryId);
    }

    @PostMapping("/{productId}/category/{categoryId}")
    public Inventory addInventoryCategory(@PathVariable Long productId, @PathVariable Long categoryId) {
        return inventoryService.addInventoryCategory(productId, categoryId);
    }
}