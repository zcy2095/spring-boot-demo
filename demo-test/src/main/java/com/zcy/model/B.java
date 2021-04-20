package com.zcy.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
@Component
public class B {

 @Autowired
 private A a;

    public B(){

    }

    public void setA(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }
}
