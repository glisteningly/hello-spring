package com.example.hello.aop.proxy;

import com.example.hello.aop.intercept.Interceptor;
import com.example.hello.aop.invoke.Invoacation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBean implements InvocationHandler {
    private Object target = null;
    private Interceptor interceptor = null;

    /**
     * @param target      被代理对象
     * @param interceptor 拦截器
     * @return 代理对象
     */
    public static Object getProxyBean(Object target, Interceptor interceptor) {
        ProxyBean proxyBean = new ProxyBean();
        // 保存被代理对象
        proxyBean.target = target;
        // 保存拦截器
        proxyBean.interceptor = interceptor;
        // 生成代理对象
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                proxyBean);

        // 返回代理对象
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 异常标识
        boolean exceptionFlag = false;
        Invoacation invoacation = new Invoacation(target, method, args);
        Object retObj = null;

        try {
            if (this.interceptor.before()) {
                retObj = this.interceptor.around(invoacation);
            } else {
                retObj = method.invoke(target, args);
            }
        } catch (Exception ex) {
            exceptionFlag = true;
        }
        this.interceptor.after();
        if (exceptionFlag) {
            this.interceptor.afterThrowing();
        } else {
            this.interceptor.afterReturning();
            return retObj;
        }
        return null;
    }
}
