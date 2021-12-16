package com.sut.thread;

public class StopThreadDemo extends Thread {

    public static boolean isContinue = true;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程开始。。。");

        StopThreadDemo std = new StopThreadDemo();
        std.start();

        sleep(3000);
        isContinue = false;
        System.out.println("主线程结束！");
    }

    @Override
    public void run() {
        System.out.println("子线程开始。。。");
        while (isContinue) {
            System.out.println("子线程执行。。。");
        }
    }
}
