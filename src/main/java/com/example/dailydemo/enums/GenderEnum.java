package com.example.dailydemo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: dyb
 * @Date: 2022/7/22
 * @Description:
 */
@Getter
@AllArgsConstructor
@DictEnum(name = "sex")
public enum GenderEnum implements IBaseEnum<Integer> {

    MAN(1, "男"),
    WOMAN(2, "女"),
    OTHERS(3, "其他");

    private Integer value;
    private String label;

}

