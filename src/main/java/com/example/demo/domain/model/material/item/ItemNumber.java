package com.example.demo.domain.model.material.item;

public class ItemNumber {
    Integer value;

    private ItemNumber() {}

    public ItemNumber(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }
}