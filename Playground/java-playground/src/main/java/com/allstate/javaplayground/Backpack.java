package com.allstate.javaplayground;

public class  Backpack {

    String name;
    int volume;
    String color;
    int pocketNum;
    int strapLengthL;
    int strapLengthR;
    boolean lidOpen;

    public Backpack(String name, int volume, String color, int pocketNum, int strapLengthL, int strapLengthR, boolean lidOpen) {
        this.name = name;
        this.volume = volume;
        this.color = color;
        this.pocketNum = pocketNum;
        this.strapLengthL = strapLengthL;
        this.strapLengthR = strapLengthR;
        this.lidOpen = lidOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPocketNum() {
        return pocketNum;
    }

    public void setPocketNum(int pocketNum) {
        this.pocketNum = pocketNum;
    }

    public int getStrapLengthL() {
        return strapLengthL;
    }

    public void setStrapLengthL(int strapLengthL) {
        this.strapLengthL = strapLengthL;
    }

    public int getStrapLengthR() {
        return strapLengthR;
    }

    public void setStrapLengthR(int strapLengthR) {
        this.strapLengthR = strapLengthR;
    }

    public boolean isLidOpen() {
        return lidOpen;
    }

    public void setLidOpen(boolean lidOpen) {
        this.lidOpen = lidOpen;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", pocketNum=" + pocketNum +
                ", strapLengthL=" + strapLengthL +
                ", strapLengthR=" + strapLengthR +
                ", lidOpen=" + lidOpen +
                '}';
    }

//    static void newStrapLength(int left, int right) {
//        strapLengthL = left;
//        strapLengthR = right;
//    }

    public void toggleLid(boolean lidStatus) {
        lidOpen = lidStatus;
    }

    public static void main(String[] args) {


//        newStrapLength(26, 26);

        Backpack backpack1 = new Backpack("everyday backpack", 15, "grey", 15, 26, 26, false);
//        backpack1.backpack = "Everkday Backpack";
//        backpack1.strapLength(26, 26);

        System.out.println(backpack1);
    }

}
