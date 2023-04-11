package com.example.toptenmusic.service;

import com.example.toptenmusic.model.Album;
import com.example.toptenmusic.model.Single;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTenService {

    private ArrayList<Single> singlesTopTen;
    private ArrayList<Album> albumsTopTen;

    public ArrayList<Single> getsinglesTopTen() {

        this.singlesTopTen = new ArrayList<Single>();

        //add singles here!
        this.singlesTopTen.add(new Single("Take Me Back To London", "Ed Sheeran Ft. Stormzy", "edSheeran.png",  "1"));
        this.singlesTopTen.add(new Single("Taste (Make It Shake)", "Aitch", "aitch.png", "2"));
        this.singlesTopTen.add(new Single("Higher Love", "Kygo & Whitney Houston", "kygo.png","3"));
        this.singlesTopTen.add(new Single("Ladbroke Grove", "AJ Tracey", "ajTracey.png", "4"));
        this.singlesTopTen.add(new Single("Circles", "Post Malone", "postMalone.png", "5"));
        this.singlesTopTen.add(new Single("Sorry", "Joel Corry", "joelCorry.png", "6"));
        this.singlesTopTen.add(new Single("3 Nights", "Dominic Fike", "dominicFike.png", "7"));
        this.singlesTopTen.add(new Single("Ransom", "Lil Tecca", "lilTecca.png", "8"));
        this.singlesTopTen.add(new Single("Strike A Pose", "Young T & Bugsey Ft Aitch", "youngT.png", "9"));
        this.singlesTopTen.add(new Single("Goodbyes", "Post Malone Ft Young Thug", "postMaloneFtYoungThug.png", "10"));
        return this.singlesTopTen;
    }

    public ArrayList<Album> getalbumsTopTen() {

        this.albumsTopTen = new ArrayList<Album>();

        //add albums here!
        this.albumsTopTen.add(new Album("Hollywood's Bleeding", "Post Malone", "postMaloneA.png", "1"));
        this.albumsTopTen.add(new Album("No.6 Collaborations Project", "Ed Sheeran", "edSheeranA.png", "2"));
        this.albumsTopTen.add(new Album("Aitch20", "Aitch", "aitchA.png", "3"));
        this.albumsTopTen.add(new Album("Lover", "Taylor Swift", "taylorSwiftA.png", "4"));
        this.albumsTopTen.add(new Album("Divinely Uninspired To A Hellish Extent", "Lewis Capaldi", "lewisCapaldiA.png", "5"));
        this.albumsTopTen.add(new Album("Backbone", "Status Quo", "statusQuoA.png", "6"));
        this.albumsTopTen.add(new Album("Norman F***king Rockwell", "Lana Del Rey", "lanaDelReyA.gif", "7"));
        this.albumsTopTen.add(new Album("K-12", "Melanie Martinez", "melanieMartinezA.png", "8"));
        this.albumsTopTen.add(new Album("Snacks", "Jax Jones", "jaxJonesA.png", "9"));
        this.albumsTopTen.add(new Album("When We All Fall Asleep Where Do We Go", "Billie Eilish", "billieEilishA.png", "10"));
        return this.albumsTopTen;
    }

}
