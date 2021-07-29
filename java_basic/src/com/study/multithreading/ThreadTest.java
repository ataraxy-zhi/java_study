package com.study.multithreading;

/**
 * 继承 Thread 类，重写 run() 方法，调用 start() 方法
 *
 * @author yi
 * @date 2021/7/29 21:43
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

        System.out.println("hello");

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

/**
 * 继承 Thread 类，重写 run() 方法，调用 start() 方法
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}