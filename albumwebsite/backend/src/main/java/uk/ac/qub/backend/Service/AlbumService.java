package uk.ac.qub.backend.Service;

import org.springframework.stereotype.Service;
import uk.ac.qub.backend.Model.Album;
import uk.ac.qub.backend.Repository.AlbumRepository;

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
