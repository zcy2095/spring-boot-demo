package com.zcy.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class CallAble {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new TestCallAble());
        new Thread(futureTask).start();
        Set<String> set = new HashSet<>();
        System.out.println(futureTask.get());
    }


    static class TestCallAble implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "123";
        }
    }
}
