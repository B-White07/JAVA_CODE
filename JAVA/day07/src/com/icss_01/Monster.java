package com.icss_01;

public class Monster {
    private int grade = 1;
    private int life = 1000*grade;

    public Monster() {
    }

    public Monster(int grade, int life) {
        this.grade = grade;
        this.life = life;
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
}