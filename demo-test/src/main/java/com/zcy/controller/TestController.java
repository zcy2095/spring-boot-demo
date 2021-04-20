package com.zcy.controller;

import com.zcy.spi.SPI;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class TestController {

    public static void main(String[] args) {
        ServiceLoader<SPI> load = ServiceLoader.load(SPI.class);
        Iterator<SPI> iterator = load.iterator();
        while (iterator.hasNext()) {
            SPI next = iterator.next();
            next.say();
        }
    }
}
