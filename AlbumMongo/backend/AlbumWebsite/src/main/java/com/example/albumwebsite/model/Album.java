package com.example.albumwebsite.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "albums")
public class Album {

    @Id
    private String id;

    private String  number;
    private String  year;
    private String  title;
    private String  artist;
    private String  genre;
    private String  subgenre;
    private String  artwork;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }

    public String getArtwork() {
        return artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", year='" + year + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", subgenre='" + subgenre + '\'' +
                ", artwork='" + artwork + '\'' +
                '}';
    }
}
