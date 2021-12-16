package com.icss_01;

public class HeroMan {
    private int grade = 1; //0-30
    private int life = 675;
    private long exp; //经验值,对应grade1-30   exp = 30(n^3 + 5n) - 80
    private int atk = 57; //攻击力

    public HeroMan() {
        exp = 0;
    }

    public HeroMan(long exp) {
        this.exp = exp;

        long[] exparr = new long[30];
        for (int i = 1; i <= 30; i++) {
            exparr[i - 1] = 30 * (i * i * i + 5 * i) - 80;
        }

        if (this.exp > exparr[29]) {
            this.exp = exparr[29] - 1;
        } else if (this.exp <= 0) {
            this.exp = 0;
        }

        for (int i = 1; i < exparr.length; i++) {
            if (this.exp >= exparr[i - 1] && this.exp < exparr[i]) {
                grade = i + 1;
            }
        }

//        for (long i : exparr) {
//            System.out.println(i);
//        }

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getLife() {
        return life + 100 * getGrade();
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
        return atk + 2*getGrade();
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
