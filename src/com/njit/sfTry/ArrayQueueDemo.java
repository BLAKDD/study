package com.njit.sfTry;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner sannner = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):推出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):peek队列");
            key = sannner.next().charAt(0);
            switch (key){
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value = sannner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = arrayQueue.peek();
                        System.out.printf("队列头的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    sannner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

class ArrayQueue{
    private int maxSize;
    private int front; //队列头
    private int rear;   //队列尾
    private int[] arr;

    //创建队列构造器
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        this.front = -1;//指向队列头部的前一个位置
        this.rear = -1; //指向队列尾部指向队列尾部。
    }

    //判断队列是否满
    public boolean ifFull(){
        return rear == maxSize-1;
    }

    //判断队列是否为空
    public boolean ifEmpty(){
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n){
        if (ifFull())
        {
            System.out.println("队列满，不能加入");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    //出队列
    public int getQueue(){
        if (ifEmpty())
            throw new RuntimeException("队列空，不能取数据");
        front++;
        return arr[front];
    }

    //显示队列所有数据
    public void showQueue()
    {
        if(ifEmpty())
            System.out.println("队列为空");
        for (int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    //显示队列头，不取出来
    public int peek(){
        if (ifEmpty())
            throw new RuntimeException("队列空，不能peek数据");
        return arr[front+1];
    }
}