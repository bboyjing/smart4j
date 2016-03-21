package cn.didadu.smart4j.chapter3.smartFramework.helper;

import cn.didadu.smart4j.chapter3.smartFramework.annotaion.Inject;
import cn.didadu.smart4j.chapter3.smartFramework.util.ArrayUtil;
import cn.didadu.smart4j.chapter3.smartFramework.util.CollectionUtil;
import cn.didadu.smart4j.chapter3.smartFramework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 用于获取依赖注入的对象
 * 流程：遍历BeanHelper中存储的所有bean，如果bean的成员变量上有@inject注解，调用setField方法将成员变量赋值(所有的bean都存储咋BeanHelper中1)
 * Created by jinggg on 16/3/21.
 */
public class IocHelper {

    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    for (Field beanField : beanFields) {
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }

}
