package pa.spring;

import java.util.ArrayList;

public class DwarfsAndDwarves {

    public static void main(String[] args) {

        ArrayList<String> dwarfs = new ArrayList<String>();

        dwarfs.add("Happy");
        dwarfs.add("Sleepy");
        dwarfs.add("Dopey");
        dwarfs.add("Bashful");
        dwarfs.add("Sneezy");
        dwarfs.add("Doc");
        dwarfs.add("Grumpy");
        dwarfs.add("Happy");

        System.out.println("The Disney Dwarfs are:");

        for (String dwarf: dwarfs) {
            System.out.println(dwarf);
        }

        ArrayList<String> dwarves = new ArrayList<String>();

        dwarves.add("Thorin");
        dwarves.add("Balin");
        dwarves.add("Dwalin");
        dwarves.add("Fili");
        dwarves.add("Dori");
        dwarves.add("Nori");
        dwarves.add("Ori");
        dwarves.add("Oin");
        dwarves.add("Gloin");
        dwarves.add("Bifur");
        dwarves.add("Bofur");
        dwarves.add("Bombur");

        System.out.println("The Tolkien Dwarves are:");

        for (String dwarve: dwarves) {
            System.out.println(dwarve);
        }
    }

}
