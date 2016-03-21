package cn.didadu.smart4j.controller;

import java.lang.reflect.Method;

import cn.didadu.smartframework.annotaion.Aspect;
import cn.didadu.smartframework.annotaion.Controller;
import cn.didadu.smartframework.proxy.AspectProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 拦截 Controller 所有方法
 *
 * @author huangyong
 * @since 1.0.0
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    private long begin;

    @Override
    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        /*LOGGER.debug("---------- begin ----------");
        LOGGER.debug(String.format("class: %s", cls.getName()));
        LOGGER.debug(String.format("method: %s", method.getName()));
        begin = System.currentTimeMillis();

        System.out.println("---------- begin ----------");
        System.out.println(String.format("class: %s", cls.getName()));
        System.out.println(String.format("method: %s", method.getName()));
        System.out.println(begin);*/
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
        /*LOGGER.debug(String.format("time: %dms", System.currentTimeMillis() - begin));
        LOGGER.debug("----------- end -----------");

        System.out.println(String.format("time: %dms", System.currentTimeMillis() - begin));
        System.out.println("----------- end -----------");*/
    }
}
