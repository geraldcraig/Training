package com.example.dwarfwebsite.service;

import com.example.dwarfwebsite.model.Dwarf;
import com.example.dwarfwebsite.repository.DwarfRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class DwarfService {

    Logger log = LoggerFactory.getLogger(DwarfService.class);

    @Autowired
    private DwarfRepository dwarfRepository;

	/*public void getNumberOfDwarfs() {
		log .info(" of tasks: {}", dwarfRepository.count());
	}*/

    //private ArrayList<Dwarf> disneyDwarfs;
    //private ArrayList<Dwarf> tolkienDwarfs;

    //public ArrayList<Dwarf> getDisneyDwarfs() {

    //this.disneyDwarfs = new ArrayList<Dwarf>();

    //add dwarfs here!
		/*this.disneyDwarfs.add(new Dwarf("Sleepy", "Disney", "Sleepy.png"));
		this.disneyDwarfs.add(new Dwarf("Happy", "Disney", "Happy.png"));
		this.disneyDwarfs.add(new Dwarf("Bashful", "Disney", "Bashful.png"));
		this.disneyDwarfs.add(new Dwarf("Dopey", "Disney", "Dopey.png"));
		this.disneyDwarfs.add(new Dwarf("Doc", "Disney", "Doc.png"));
		this.disneyDwarfs.add(new Dwarf("Grumpy", "Disney", "Grumpy.png"));
		this.disneyDwarfs.add(new Dwarf("Sneezy", "Disney", "Sneezy.png"));*/

    public Iterable<Dwarf> getNumberOfDwarfs() {
        log.info("# of dwarfs: {}", dwarfRepository.count());
        Iterable <Dwarf> dwarf = dwarfRepository.findAll();
        Iterator<Dwarf> iterator = dwarf.iterator();
        //ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
        while (iterator.hasNext()) {
            log.info("{}", iterator.next().toString());
            //dwarfList.add(iterator.next());
        }

        return dwarf;
    }

    public Iterable<Dwarf> getDisneyDwarfs() {
        log.info("# of dwarfs: {}", dwarfRepository.count());
        Iterable <Dwarf> dwarf = dwarfRepository.findAll();
        Iterator <Dwarf> iterator = dwarf.iterator();
        //ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
        while (iterator.hasNext()) {
            log.info("{}", iterator.next().toString());
            //dwarfList.add(iterator.next());
        }

        return dwarf;
    }

    public Iterable<Dwarf> getTolkienDwarfs() {
        log.info("# of dwarfs: {}", dwarfRepository.count());
        Iterable <Dwarf> dwarf = dwarfRepository.findAll();
        Iterator <Dwarf> iterator = dwarf.iterator();
        //ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
        while (iterator.hasNext()) {
            log.info("{}", iterator.next().toString());
            //dwarfList.add(iterator.next());
        }

        return dwarf;
    }

	/*public ArrayList<Dwarf> getTolkienDwarfs() {

		this.tolkienDwarfs = new ArrayList<Dwarf>();

		//add dwarfs here!
		this.tolkienDwarfs.add(new Dwarf("Balin", "Tolkien", "Balin.png"));
		this.tolkienDwarfs.add(new Dwarf("Bifur", "Tolkien", "Bifur.png"));
		this.tolkienDwarfs.add(new Dwarf("Bofur", "Tolkien", "Bofur.png"));
		this.tolkienDwarfs.add(new Dwarf("Bombur", "Tolkien", "Bombur.png"));
		this.tolkienDwarfs.add(new Dwarf("Dori", "Tolkien", "Dori.png"));
		this.tolkienDwarfs.add(new Dwarf("Dwalin", "Tolkien", "Dwalin.png"));
		this.tolkienDwarfs.add(new Dwarf("Fili", "Tolkien", "Fili.png"));
		this.tolkienDwarfs.add(new Dwarf("Gloin", "Tolkien", "Gloin.png"));
		this.tolkienDwarfs.add(new Dwarf("Kili", "Tolkien", "Kili.png"));
		this.tolkienDwarfs.add(new Dwarf("Nori", "Tolkien", "Nori.png"));
		this.tolkienDwarfs.add(new Dwarf("Oin", "Tolkien", "Oin.png"));
		this.tolkienDwarfs.add(new Dwarf("Ori", "Tolkien", "Ori.png"));
		this.tolkienDwarfs.add(new Dwarf("Thorin", "Tolkien", "Thorin.png"));
		return this.tolkienDwarfs;
}*/

}

