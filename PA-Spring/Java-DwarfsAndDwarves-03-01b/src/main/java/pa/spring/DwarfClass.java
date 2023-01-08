package pa.spring;

import java.util.ArrayList;

public class DwarfClass {

    public static void main(String[] args) {

        ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

        Dwarf doc = new Dwarf();
        doc.setName("Doc");
        doc.setAuthor("Disney");
        dwarfs.add(doc);

        Dwarf happy = new Dwarf();
        happy.setName("Happy");
        happy.setAuthor("Disney");
        dwarfs.add(happy);

        Dwarf thorin = new Dwarf();
        thorin.setName("Thorin");
        thorin.setAuthor("Tolkien");
        dwarfs.add(thorin);

        Dwarf balin = new Dwarf();
        balin.setName("Balin");
        balin.setAuthor("Tolkien");
        dwarfs.add(balin);

        System.out.println("The Disney Dwarfs are:");

        for (Dwarf dwarf: dwarfs) {
            if (dwarf.getAuthor().equals("Disney")) {
                System.out.println(dwarf.getName());
            }
        }

        System.out.println("The Tolkien Dwarves are:");

        for (Dwarf dwarf: dwarfs) {
            if (dwarf.getAuthor().equals("Tolkien")) {
                System.out.println(dwarf.getName());
            }
        }
    }
}
