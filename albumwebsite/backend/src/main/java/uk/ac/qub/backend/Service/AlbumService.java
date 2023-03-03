package uk.ac.qub.backend.Service;

import org.springframework.stereotype.Service;
import uk.ac.qub.backend.Model.Album;
import uk.ac.qub.backend.Repository.AlbumRepository;

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

}
