package com.future.commerce.productcatalogservice.events;

public class ProductCreatedEvent {

    private Long productId;

    public ProductCreatedEvent(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }
}