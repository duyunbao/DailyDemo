package com.example.dailydemo.enums;

import java.lang.annotation.*;

/**
 * @author: dyb
 * @Date: 2022/7/22
 * @Description:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DictEnum {
    /**
     * 字典标识
     */
    String name();
}
