package com.example.dwarfwebsite.controller;

import com.example.dwarfwebsite.service.DwarfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DwarfController {

    @Autowired
    private DwarfService dwarfService;

    Logger log = LoggerFactory.getLogger(DwarfController.class);


    @GetMapping()
    public String homePage(Model model) {

        dwarfService.getNumberOfDwarfs();

        model.addAttribute("pageTitle", "Dwarfs rule");
        model.addAttribute("numberOfDwarfs", this.dwarfService.getNumberOfDwarfs());

        String name = "Gerald";
        model.addAttribute("myName", name);

        log.info("index page" + name);
        log.debug("there is a possible path error page one is not able to load");;
        return "index";
    }

    @GetMapping("/disney")
    public String disneyPage(Model model) {
        dwarfService.getNumberOfDwarfs();

        model.addAttribute("pageTitle", "Disney Dwarfs rule");
        model.addAttribute("dwarfs", this.dwarfService.getDisneyDwarfs());

        String name = "Gerald";
        model.addAttribute("myName", name);

        log.info("page 2" + name);
        log.debug("there is a possible path error page one is not able to load");;
        return "disney";
    }

    @GetMapping("/tolkien")
    public String tolkienPage(Model model) {
        dwarfService.getNumberOfDwarfs();

        model.addAttribute("pageTitle", "Tolkien Dwarfs rule");

        model.addAttribute("dwarfs", this.dwarfService.getTolkienDwarfs());

        String name = "Gerald";
        model.addAttribute("myName", name);

        log.info("page 3" + name);
        log.debug("there is a possible path error page one is not able to load");;
        return "tolkien";
    }

}
