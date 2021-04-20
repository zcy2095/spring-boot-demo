package com.zcy.controller;

import java.lang.reflect.Constructor;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class Singleton {
    private Singleton() {
        if(singleton!=null){
            throw new RuntimeException("滚");
        }
        System.out.println(Thread.currentThread().getName());
    }

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) throws Exception {
        Constructor<?> constructor = Singleton.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Singleton instance1 = (Singleton) constructor.newInstance();
        Singleton instance2 = (Singleton) constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
