package com.example.demo.domain.model.material.entry;

/**
 * 資料番号
 */
public class EntryNumber {
    Integer value;

    @Deprecated
    public EntryNumber() {}

    public EntryNumber(int value) {this.value = (Integer) value;}

    public EntryNumber(String value) {
        this.value = Integer.valueOf(value);
    }

    public EntryNumber(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }

    public boolean sameValue(EntryNumber other) {
        return this.value == other.value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
