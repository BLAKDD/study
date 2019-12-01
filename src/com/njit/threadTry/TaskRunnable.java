package com.njit.threadTry;

public class TaskRunnable implements Runnable{
    private String name;
    private int count = 0;
    public TaskRunnable(String name)
    {
        this.name = name;
    }
    @Override
    public void run() {
        count += 1;
        for (int i = 0; i < 1001; i++) {
            if(i%500==0)
                System.out.println(name+"任务在执行"+i+"第"+count);
        }
        System.out.println(name+"执行完毕！");
    }
}
