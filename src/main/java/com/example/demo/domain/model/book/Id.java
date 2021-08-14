package com.example.demo.domain.model.book;

public class Id {
    private Integer value;

    @Deprecated
    public Id() {}

    public Id(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MaterialId{" + "value=" + value + '}';
    }
}
