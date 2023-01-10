package pa.spring.springbootdwarfsanddwarves0301e.controller;

import pa.spring.springbootdwarfsanddwarves0301e.service.DwarfService;

public class DemoController {

    private final DwarfService dwarfService;

    public DemoController(DwarfService dwarfService) {
        this.dwarfService = dwarfService;
    }
}
