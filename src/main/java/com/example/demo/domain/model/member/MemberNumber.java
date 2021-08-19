package com.example.demo.domain.model.member;

import javax.validation.constraints.NotNull;

/**
 * 会員番号
 */
public class MemberNumber {
    @NotNull(message = "会員番号を入力してください。") Integer value;

    public MemberNumber(Integer value) {
        this.value = value;
    }

    @Deprecated
    MemberNumber() {
    }

    public static MemberNumber empty() {
        return new MemberNumber();
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == null || value == 0) return "";
        return Integer.toString(value);
    }
}
