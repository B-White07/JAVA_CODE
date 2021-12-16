package com.icss_01;

public class Hero {
    private int grade = 1;
    private int life;
    private long exp; //经验值
    private int atk = 57; //攻击力

    /*
    击打方法
     */
    public int bit(Monster mon){
        int nowLife = mon.getLife() - atk;
        return nowLife;
    }

    public Hero() {
    }

    public Hero(int grade, int life, long exp, int atk) {
        this.grade = grade;
        this.life = life;
        this.exp = exp;
        this.atk = atk;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
