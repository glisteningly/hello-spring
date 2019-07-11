package com.example.hello.aop.invoke;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoacation {
    @Getter
    @Setter
    private Object[] params;
    @Getter
    @Setter
    private Method method;
    @Getter
    @Setter
    private Object target;

    public Invoacation(Object target, Method method, Object[] params) {
        this.target = target;
        this.method = method;
        this.params = params;
    }

    // 反射方法
    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, params);
    }


}
