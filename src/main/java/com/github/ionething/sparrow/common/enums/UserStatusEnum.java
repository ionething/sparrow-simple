package com.github.ionething.sparrow.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum UserStatusEnum {
    NORMAL(1, "正常"),
    LOCKED(2, "锁定"),
    FROZEN(3, "冻结");

    @EnumValue
    private final Integer value;

    private final String desc;

    UserStatusEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
