package com.example.concerts.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Concert {

    @Id
    private String id;

    private String artist;

    private String venue;

    private String date;


}
