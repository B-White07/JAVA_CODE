package com.icss_04;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("张三",1,10);
        Player player2 = new Player("李四",5,50);
        Player player3 = new Player("王五",10,100);

        System.out.println("目前玩家总数是：" + Player.showPlayerNum());
        System.out.println("玩家1信息：" + "\t姓名：" + player1.getName() + "\t等级："
                + player1.getLevel() + "\t能量值: " + player1.getPower());
        System.out.println("玩家2信息：" + "\t姓名：" + player2.getName() + "\t等级："
                + player2.getLevel() + "\t能量值：" + player2.getPower());
        System.out.println("玩家3信息：" + "\t姓名：" + player3.getName() + "\t等级："
                + player3.getLevel() + "\t能量值：" + player3.getPower());
    }
}
