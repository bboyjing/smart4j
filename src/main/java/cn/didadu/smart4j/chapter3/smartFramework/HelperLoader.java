package cn.didadu.smart4j.chapter3.smartFramework;

import cn.didadu.smart4j.chapter3.smartFramework.helper.*;
import cn.didadu.smart4j.chapter3.smartFramework.util.ClassUtil;

/**
 * Created by jinggg on 16/3/21.
 */
public class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }

}
