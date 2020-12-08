package com.xkcoding.activiti;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SpringExecutorTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        while (true){
            service.execute(()-> System.out.println("我是一个任务，运行时间为"+System.currentTimeMillis()));
        }
    }
}
