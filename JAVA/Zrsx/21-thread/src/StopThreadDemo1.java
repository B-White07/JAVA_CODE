public class StopThreadDemo1 extends Thread {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程开始");

        StopThreadDemo1 std = new StopThreadDemo1();
        std.start();

        sleep(3000);
        //中断线程
        std.interrupt();
        System.out.println("主线程结束");

    }

    @Override
    public void run() {
        System.out.println("子线程开始。。。。。");
        while (!isInterrupted()) {
            System.out.println("子线程执行。。。。");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // e.printStackTrace();
                interrupt();
            }
        }
        System.out.println("子线程over......");
    }
}
