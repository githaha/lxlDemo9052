package com.tasks;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@Component
public class AsyncTask {

    @Async
    public Future<Boolean> doTask11() throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时："+ (end - start)+"毫秒");
        return new AsyncResult<>(true);
    }
    @Async
    public Future<Boolean> doTask12() throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务2耗时："+ (end - start)+"毫秒");
        return new AsyncResult<>(true);
    }
    @Async
    public Future<Boolean> doTask13() throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务3耗时："+ (end - start)+"毫秒");
        return new AsyncResult<>(true);
    }
    @Async
    public Future<Boolean> doTask14() throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务4耗时："+ (end - start)+"毫秒");
        return new AsyncResult<>(true);
    }
}
