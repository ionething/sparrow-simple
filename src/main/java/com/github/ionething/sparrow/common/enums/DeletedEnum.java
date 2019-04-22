package com.github.ionething.sparrow.common.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;
import lombok.Getter;
import lombok.ToString;

/**
 * @author wangxin
 */
@Getter
@ToString
public enum DeletedEnum implements IEnum<Integer> {
    DELETED(1, "已删除"),
    NO_DELETED(0, "未删除");

    private Integer value;
    private String desc;

    DeletedEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }
}
