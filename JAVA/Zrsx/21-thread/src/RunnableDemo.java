public class RunnableDemo {
    public static void main(String[] args) {
        //线程启动


        //启动，调用start
        Thread t3 = new Thread(new MyThread1(), "线程3");
        t3.start();

        Thread t4 = new Thread(new MyThread1(), "线程4");
        t4.start();

    }
}


class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "----------子线程----------：：：：" + i);
        }
    }
}