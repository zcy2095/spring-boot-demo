package com.zcy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class ReadWriteLockDemo {

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                testDemo.put();
            }, String.valueOf(i)).start();
        }

        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                testDemo.get();
            }, String.valueOf(i)).start();
        }
    }

    static class TestDemo {
        List<Integer> aa = new ArrayList<>();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        public void put() {
            readWriteLock.writeLock().lock();
            for (int i = 0; i < 100; i++) {
                aa.add(i);
            }
            System.out.println(Thread.currentThread().getName() + "==>放值");
            System.out.println(Thread.currentThread().getName() + "==>放值ok");
            readWriteLock.writeLock().unlock();
        }

        public void get() {
            readWriteLock.readLock().lock();
            aa.get(0);
            System.out.println(Thread.currentThread().getName() + "==>取值");
            System.out.println(Thread.currentThread().getName() + "==>取值ok");
            readWriteLock.readLock().unlock();
        }
    }
}
