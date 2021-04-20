package com.zcy.controller;

import org.apache.tomcat.util.collections.SynchronizedQueue;

import java.util.concurrent.SynchronousQueue;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class SynchronousQueueDemo {

    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<String> queue = new SynchronousQueue();

        for (int i = 0; i < 200; i++) {
            new Thread(() -> {
                queue.offer("1");
                queue.offer("2");
                queue.offer("3");
                queue.offer("3");
                queue.offer("3");
                queue.offer("3");
                queue.offer("3");
                queue.offer("3");
                queue.offer("3");
                queue.offer("3");
                queue.offer("4");
            }).start();
        }


        for (int i = 0; i < 60; i++) {
            new Thread(() -> {
                System.out.println(queue.poll());
            }).start();
        }

    }
}
