package com.oreilly.restclient.json;

public class Assignment {
    String craft;
    String name;

    public Assignment() {
    }

    public Assignment(String craft, String name) {
        this.craft = craft;
        this.name = name;
    }

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "craft='" + craft + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
