package com.thread;
//定义Counter类，让count自增10w次
class Counter{
    public int count;

    public void increase(){
        count++;
    }
}

public class ThreadSafetyTest {
    //实例化Counter对象
    public static Counter counter = new Counter();

    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++){
                counter.increase();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++){
                counter.increase();
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count: " + counter.count);
    }
}
