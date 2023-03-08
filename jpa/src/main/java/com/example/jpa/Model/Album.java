package com.example.jpa.Model;

import javax.persistence.*;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String album;

    @Column(nullable = false)
    private String artist;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private Integer number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                ", number=" + number +
                '}';
    }
}
