package com.example.demo.domain.model.material.item;

import javax.validation.constraints.NotBlank;

public class ItemNumber {
    @NotBlank(message = "所蔵品番号を入力してください。") String value;

    @Deprecated
    ItemNumber() {}

    public ItemNumber(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "ItemNumber{" + "value='" + value + '\'' + '}';
    }
}
