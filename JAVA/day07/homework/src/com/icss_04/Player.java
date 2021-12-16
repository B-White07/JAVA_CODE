package com.icss_04;

public class Player {
    private String name;
    private int level;
    private int power;
    private static int playerNum;

    public Player(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.power = power;
        playerNum++;
    }

    public void say(){
        System.out.println("玩家发表评论了");
    }

    public static int showPlayerNum(){
        return playerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
