package com.example.dailydemo.enums;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: dyb
 * @Date: 2022/7/25
 * @Description:
 */
@Data
public class EnumValue implements Serializable {

    private Object value;

    private String label;
}
