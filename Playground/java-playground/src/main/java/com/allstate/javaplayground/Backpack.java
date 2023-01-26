package com.allstate.javaplayground;

public class Backpack {

    String backpack;
    int volume;
    String color;
    int pocketNum;
    boolean lidOpen;
    StrapLength strapLength;

    public class Straplength {
        int left;
        int right;

        public int getRight() {
            return right;
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public void setRight(int right) {
            this.right = right;
        }
    }

    private void strapLength(int left, int right) {

    }

    public Backpack() {
    }

    public Backpack(String backpack, int volume, String color, int pocketNum, boolean lidOpen, StrapLength strapLength) {
        this.backpack = backpack;
        this.volume = volume;
        this.color = color;
        this.pocketNum = pocketNum;
        this.lidOpen = lidOpen;
        this.strapLength = strapLength;
    }

    public String getBackpack() {
        return backpack;
    }

    public void setBackpack(String backpack) {
        this.backpack = backpack;
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

    public boolean isLidOpen() {
        return lidOpen;
    }

    public void setLidOpen(boolean lidOpen) {
        this.lidOpen = lidOpen;
    }

    public StrapLength getStrapLength() {
        return strapLength;
    }

    public void setStrapLength(StrapLength strapLength) {
        this.strapLength = strapLength;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "backpack='" + backpack + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", pocketNum=" + pocketNum +
                ", lidOpen=" + lidOpen +
                ", strapLength=" + strapLength +
                '}';
    }

    public static void main(String[] args) {

        Backpack backpack1 = new Backpack();
        backpack1.backpack = "Everkday Backpack";
        backpack1.strapLength(26, 26);

        System.out.println(backpack1);
    }
}
