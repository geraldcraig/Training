package uk.ac.qub.backend.Controller;

import uk.ac.qub.backend.Model.Album;
import uk.ac.qub.backend.Service.AlbumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/home")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @GetMapping("/{id}")
    public Album getAlbumById(@PathVariable Long id) {
        return albumService.getAlbumsById(id);
    }

}
