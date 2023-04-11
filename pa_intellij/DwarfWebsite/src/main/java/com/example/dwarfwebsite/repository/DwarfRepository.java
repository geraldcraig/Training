package com.example.dwarfwebsite.repository;

import com.example.dwarfwebsite.model.Dwarf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DwarfRepository extends JpaRepository<Dwarf, Long> {
}
