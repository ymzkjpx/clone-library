package com.example.demo.domain.model.material.item;

public class ItemNumber {
    Integer value;

    @Deprecated
    ItemNumber() {}

    public ItemNumber(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }
}
