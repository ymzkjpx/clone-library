package com.example.demo.domain.model.member;

import javax.validation.constraints.Size;

public enum MemberType {
    大人("18歳以上"), 中人("12~17歳"), 小人("11歳以下");

    String range;

    MemberType(String range) {
        this.range = range;
    }

    @Size(min = 0, max = 100)
    public static MemberType of(int age) {
        if (age < 12) return 小人;
        if (age < 18) return 中人;
        return 大人;
    }
}

