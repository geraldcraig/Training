package com.example.mongoalbum;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "album", path = "album")
public interface AlbumRepository extends MongoRepository<Album, String> {
}
