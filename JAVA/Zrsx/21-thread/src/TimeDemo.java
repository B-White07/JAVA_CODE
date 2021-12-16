import java.text.SimpleDateFormat;

public class TimeDemo {
    public static void main(String[] args) {
        //通过匿名内部类创建线程

        System.out.println("我是主线程");



        /*new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();*/


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("i::::::::::::::::::::::::::" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("主线程结束");
    }
}


