package com.my.project.proxy.stat;

import com.my.project.proxy.dynamic.DynamicProxy;

/**
 * Created by jarry on 2017/10/30.
 */
public class Boss {
    public static void main(String[] args) {
        System.out.println("经纪人我想约会苍老师");
        StaticProxy staticProxy = new StaticProxy(new TeacherCang());
        staticProxy.meeting(18, 11);

        DynamicProxy dynamicProxy = new DynamicProxy(new TeacherCang());
        Girl girl = (Girl) dynamicProxy.getInstance();
        girl.papapa(20);

    }
}
