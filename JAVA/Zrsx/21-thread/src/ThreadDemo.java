public class ThreadDemo {
    public static void main(String[] args) {


        //创建一个线程对象
        MyThread t1 = new MyThread();
        //启动线程 start()
        t1.setName("线程1");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程2");
        t2.start();
    }
}

/**
 * 线程类
 * 创建一个类继承Thread类
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "----------子线程----------：：：：" + i);
        }
    }
}