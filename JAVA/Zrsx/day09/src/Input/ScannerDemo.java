package Input;

import java.util.Scanner;

/*
        通过Scanner输入内容，判断是否为数字，如果不是数字，请用继续输入
        使用try...catch...

 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("输入的不是整数！");
            num = sc.nextInt();
        }

        System.out.println(num);


    }
}
