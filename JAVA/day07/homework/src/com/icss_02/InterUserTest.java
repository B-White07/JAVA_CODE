package com.icss_02;

public class InterUserTest {
    public static void main(String[] args) {
        InterUser iu1 = new InterUser("001","123456");
        InterUser iu2 = new InterUser("002","111111","1240160064@qq.com");

        System.out.println("用户一：" + "\n用户ID:" + iu1.getUserId()
                + "\t用户密码：" + iu1.getPassword() + "\t用户email：" + iu1.getEmail());

        System.out.println("用户二：" + "\n用户ID:" + iu2.getUserId()
                + "\t用户密码：" + iu2.getPassword() + "\t用户email：" + iu2.getEmail());
    }
}
