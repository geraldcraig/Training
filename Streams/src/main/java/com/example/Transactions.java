package com.example;

public class Transactions {

    private int id;
    private String name;

    public Transactions() {
    }

    public Transactions(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
