package com.kayson.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author
 * @date 2020/9/22 - 14:50
 */
public class BeforeLog implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("开始执行"+target.getClass().getName()+"的"+method.getName()+"方法");
    }
}
