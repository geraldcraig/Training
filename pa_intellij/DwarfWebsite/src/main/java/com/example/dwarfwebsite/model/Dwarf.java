package com.example.dwarfwebsite.model;

import javax.persistence.*;

@Entity
@Table(name = "dwarfs")
public class Dwarf {

    //instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;
    //private int age;
    //private String image;

    // Constructors
    public Dwarf() {
    }

	/*public Dwarf(String name, String author, int age, String image) {
		super();
		this.name = name;
		this.author = author;
		this.age = age;
		this.image = image;
	}*/

    public Dwarf(String name, String author) {
        this.name = name;
        this.author = author;
    }

    //End of Constructors

    // Getters and Setters for all the variables
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

	/*@Column(name = "age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "height")
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "name" + name +  "author" + author + "age" + age + "image" + image;
	}*/

    public String toString() {
        return this.name + " " + this.author;
    }

}

