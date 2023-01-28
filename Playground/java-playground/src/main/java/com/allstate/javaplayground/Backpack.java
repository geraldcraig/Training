package com.allstate.javaplayground;

public class  Backpack {

    String name;
    int volume;
    String color;
    int pocketNum;
    int strapLengthL;
    int strapLengthR;
    boolean lidOpen;

    static void newStrapLength(int left, int right) {
       // this.strapLengthL = left;
//        strapLengthL = left;
//        strapLengthR = right;
    }

//    public static boolean toggleLid(boolean lidStatus) {
//        lidOpen = lidStatus;
//        return lidOen;
//    }

    public static void main(String[] args) {

        //toggleLid(true);

        newStrapLength(26, 26);

        Backpack backpack1 = new Backpack();
        backpack1.name = "Everyday Backpack";

//        backpack1.strapLength(26, 26);

        System.out.println(backpack1);
    }

}
