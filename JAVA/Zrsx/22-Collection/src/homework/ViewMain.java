package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewMain {
    public static void main(String[] args) {
        System.out.println(" ----------欢迎来到超市管理系统----------");
        System.out.println("|              1.管理员登陆             |");
        System.out.println("|              2.售货员登陆             |");
        System.out.println("|              3.采购员登陆             |");
        System.out.println(" --------------------------------------");

        SalePersion salePersion = new SalePersion("张三","123456",1);
        Manager manager = new Manager("李四","000000",1);
        Buyer buyer = new Buyer("王五","111111",1);

        ArrayList<SalePersion> saleList = new ArrayList<SalePersion>();
        saleList.add(salePersion);

        ArrayList<Manager> managerList = new ArrayList<Manager>();
        managerList.add(manager);

        ArrayList<Buyer> buyerList = new ArrayList<Buyer>();
        buyerList.add(buyer);

        while (true) {
            Scanner sc = new Scanner(System.in);
            int com = sc.nextInt();
            switch (com) {
                case 1:
                    System.out.println("请输入用户名：");
                    String userName = sc.next();
                    System.out.println("请输入密码：");
                    String psd = sc.next();
                    if(salePersion.logIn(userName,psd)){
                        System.out.println("登陆成功！");
                    }else{
                        System.out.println("用户名或密码错误！");
                    }

                    break;

                case 2:
                    System.out.println("请输入用户名：");
                    String userName2 = sc.next();
                    System.out.println("请输入密码：");
                    String psd2 = sc.next();
                    if(manager.logIn(userName2,psd2)) {
                        System.out.println("登陆成功！");
                    }else{
                        System.out.println("用户名或密码错误！");
                    }

                    break;

                case 3:
                    System.out.println("请输入用户名：");
                    String userName3 = sc.next();
                    System.out.println("请输入密码：");
                    String psd3 = sc.next();
                    if(buyer.logIn(userName3,psd3)){
                        System.out.println("登陆成功！");
                    }else{
                        System.out.println("用户名或密码错误！");
                    }

                    break;

                default:
                    System.out.println("请选择正确的操作（1/2/3）");
                    break;
            }
        }


    }
}
