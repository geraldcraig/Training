package com.oreilly.demo.json;

public class Greeting {
    private String message;

    public Greeting() {

    }

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' + '}';
    }
}
