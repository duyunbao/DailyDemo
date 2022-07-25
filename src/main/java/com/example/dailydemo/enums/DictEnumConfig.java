package com.example.dailydemo.enums;

import org.reflections.Reflections;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author: dyb
 * @Date: 2022/7/25
 * @Description:
 */
@Component
public class DictEnumConfig implements InitializingBean {

    private static final String BASE_PACKAGE = "com.example.*";

    private static final Map<String, List<EnumValue>> enumMap = new HashMap<>();

    public static List<EnumValue> getEnumName(String name) {
        return enumMap.get(name);
    }

    @Override
    public void afterPropertiesSet() {
        Reflections reflections = new Reflections(BASE_PACKAGE);

        Set<Class<? extends IBaseEnum>> monitorClasses = reflections.getSubTypesOf(IBaseEnum.class);
        for (Class<? extends IBaseEnum> m : monitorClasses) {
            if (m.isAnnotationPresent(DictEnum.class)) {
                DictEnum dictEnum = m.getAnnotation(DictEnum.class);
                List<EnumValue> enumValueList = new ArrayList<>();
                enumMap.put(dictEnum.name(), enumValueList);

                IBaseEnum[] enumConstants = m.getEnumConstants();
                for (IBaseEnum baseEnum : enumConstants) {
                    EnumValue enumValue = new EnumValue();
                    enumValue.setValue(baseEnum.getValue());
                    enumValue.setLabel(baseEnum.getLabel());
                    enumValueList.add(enumValue);
                }
            }
        }
    }

}
