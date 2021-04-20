package com.zcy.controller;

import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class ArrayList {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 1; i <= 300; i++) {
           new Thread(()->{
               list.add(UUID.randomUUID().toString().substring(0,6));
               System.out.println(list);
           },String.valueOf(i)).start();
        }
    }

}
