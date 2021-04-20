package com.zcy.controller;

import java.util.concurrent.*;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class ArrayBlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue =  new ArrayBlockingQueue<>(3);

        queue.put("1");
        System.out.println(queue.add("1"));
        System.out.println(queue.offer("1"));
        queue.offer("2",3, TimeUnit.SECONDS);
    }

}
