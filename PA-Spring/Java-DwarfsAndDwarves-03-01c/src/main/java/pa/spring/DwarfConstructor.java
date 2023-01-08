package pa.spring;

import java.util.ArrayList;

public class DwarfConstructor {

    public static void main(String[] args) {

        ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
        dwarfs.add(new Dwarf("Happy", "Disney", "img/Happy.png"));
        dwarfs.add(new Dwarf("Thorin", "Tolkien", "img/Thorin.png"));
        dwarfs.add(new Dwarf("Doc", "Disney", "img/Doc.png"));

        System.out.println("The Disney dwarfs are:");

        for (Dwarf dwarf : dwarfs) {
            if (dwarf.getAuthor().equals("Disney")) {
                System.out.println(dwarf.getName());
            }
        }

        System.out.println("The Tolkien dwarves are:");

        for (Dwarf dwarf : dwarfs) {
            if (dwarf.getAuthor().equals("Tolkien")) {
                System.out.println(dwarf.getName());
            }
        }
    }
}
