package uk.ac.qub.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.qub.backend.Model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
