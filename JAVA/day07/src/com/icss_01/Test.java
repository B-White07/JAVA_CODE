package com.icss_01;

public class Test {
    public static void main(String[] args) {
        Monster mon = new Monster();

        HeroMan hm = new HeroMan();
        HeroMan hm2 = new HeroMan(814419);
        System.out.println("当前等级：" + hm.getGrade() + "  当前攻击力：" + hm.getAtk() +
                "   当前生命值：" + hm.getLife() + "  当前经验值：" + hm.getExp());

        System.out.println("当前等级：" + hm2.getGrade() + "  当前攻击力：" + hm2.getAtk() +
                "   当前生命值：" + hm2.getLife() + "  当前经验值：" + hm2.getExp());

        System.out.println("当前等级：" + mon.getGrade() + "   当前生命值：" + mon.getLife());
        Hero hero = new Hero();
        int nowLife = hero.bit(mon);
        System.out.println("当前等级：" + mon.getGrade() + "   当前生命值：" + nowLife);

    }


}
