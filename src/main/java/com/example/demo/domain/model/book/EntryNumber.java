package com.example.demo.domain.model.book;

import javax.validation.constraints.NotNull;

/**
 * 資料番号
 */
public class EntryNumber {
    @NotNull(message = "資料番号を入力してください。")
    Integer value;

    @Deprecated
    public EntryNumber() {}

    public EntryNumber(int value){this.value = (Integer)value;}

    public EntryNumber(Integer value) {
        this.value = value;
    }

    public EntryNumber(String value){
        this.value = Integer.valueOf(value);
    }

    public Integer value() {
        return value;
    }

    public boolean sameValue(EntryNumber other){
        return this.value == other.value;
    }

    @Override
    public String toString() {
        return "MaterialId{" + "value=" + value + '}';
    }
}
