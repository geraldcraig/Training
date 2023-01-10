package pa.spring.springbootdwarfsanddwarves0301e.repository;

import org.springframework.data.repository.CrudRepository;
import pa.spring.springbootdwarfsanddwarves0301e.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Long> {
}
