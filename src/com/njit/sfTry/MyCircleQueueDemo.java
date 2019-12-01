package com.njit.sfTry;

import java.util.Scanner;

public class MyCircleQueueDemo {
    public static void main(String[] args) {
        System.out.println("测试数组模拟环形队列");
        MyCircleQueue aq=new MyCircleQueue(3);
        char key=' ';//接收用户输入
        Scanner scanner =new Scanner(System.in);
        boolean loop=true;
        //输出有个菜单
        while(loop){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("h(ehead):查看队列头的数据 ");
            System.out.println("g(get):取出队列头的数据 ");
            key=scanner.next().charAt(0);//接受一个字符
            switch (key){
                case 's':
                    aq.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value=scanner.nextInt();
                    aq.addQueue(value);
                    break;
                case 'g':
                    try{
                        int res=aq.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h'://查看队列头的数据
                    try{
                        int res =aq.headQueue();
                        System.out.printf("队列头的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e'://退出
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

class MyCircleQueue{
    private int maxsize;//表示队列的长度
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//该数组用于存放数据

    public MyCircleQueue(int maxsize)
    {
        this.maxsize = maxsize;
        arr = new int[maxsize];
    }

    public boolean isFull(){
        return rear-front == maxsize;
    }

    public boolean isEmpty(){
        return rear==front;
    }

    public void addQueue(int n){
        //判断队列是否为满
        if(isFull()){
            System.out.println("队列满 ，不能加入");
            return;
        }
        arr[rear%maxsize]=n;//直接将数据添加
        rear++;
    }

    public int getQueue(){
        //判断队列是否为空
        if(isEmpty()){
            //通过抛出异常
            throw new RuntimeException("队列空，不能取数据");
        }
        //这里需要分析front是指向队列的第一个元素
        //1.先把front的值保留到临时变量 2.将front后移 3.将临时变量的值返回
        int value=arr[front%maxsize];
        front++;
        return value;
    }
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        //从front开始遍历，遍历多少个元素？
        for(int i=front;i<front+size();i++){
            System.out.printf("arr[%d]=%d\n",i%maxsize,arr[i%maxsize]);
        }
    }
    //求出当前数列有效个数
    public int size(){
        return rear-front;
    }
    public int headQueue(){
        //判断
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[front%maxsize];
    }
}