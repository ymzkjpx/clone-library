package com.example.demo.domain.model.material;

public class NumberOfBook {
    private int value;
    public static int MAX_TO_SHOW = 20;

    public NumberOfBook(int value) {
        this.value = value;
    }

    public String show() {
        String over = value > MAX_TO_SHOW ? "以上" : "";
        return value + "件" + over;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
