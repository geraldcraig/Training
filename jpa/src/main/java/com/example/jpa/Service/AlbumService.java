package com.example.jpa.Service;

import com.example.jpa.Model.Album;
import com.example.jpa.Repository.AlbumRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album getAlbumsById(Long id) {
        return albumRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));
    }

    public List<Album> findAlbumByQueryName(Integer year) {
        System.out.println(year);
        return albumRepository.findByQuery(year);
    }
}
