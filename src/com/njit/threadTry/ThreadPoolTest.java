package com.njit.threadTry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        //创建Runnable线程任务对象
        TaskRunnable task1 = new TaskRunnable("线程1");
        TaskRunnable task2 = new TaskRunnable("线程2");
        TaskRunnable task3 = new TaskRunnable("线程3");
        TaskRunnable task4 = new TaskRunnable("线程4");
        TaskRunnable task5 = new TaskRunnable("线程5");
//        TaskRunnable task6 = new TaskRunnable("线程6");
//        TaskRunnable task7 = new TaskRunnable("线程7");
        //从线程池中获取线程对象
        service.submit(task1);
        service.submit(task2);
        //再获取一个线程对象
        service.submit(task3);
        service.submit(task1);
        service.submit(task4);
//        System.out.println("----------------------");
        service.submit(task5);
//        service.submit(task6);
//        service.submit(task7);
        //关闭线程池
        service.shutdown();
    }
}
