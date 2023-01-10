package pa.spring.springbootdwarfsanddwarves0301e.service;

import pa.spring.springbootdwarfsanddwarves0301e.repository.DwarfRepository;

public class DwarfService {

    private final DwarfRepository dwarfRepository;

    public DwarfService(DwarfRepository dwarfRepository) {
        this.dwarfRepository = dwarfRepository;
    }
}
