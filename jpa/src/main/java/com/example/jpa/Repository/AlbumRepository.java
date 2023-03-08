package com.example.jpa.Repository;

import com.example.jpa.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

    @Query("SELECT a FROM Album a WHERE a.year=?1")
    List<Album> findByQuery(Integer year);
}
