package com.example.todoapplication.model;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private String date;

    @Column(name = "status")
    private String status;

    @Column(name = "user")
    private String user;

    @Column(name = "priority")
    private String priority;

    public Todo() {
    }

    public Todo(String name, String description, String date, String status, String user, String priority) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.status = status;
        this.user = user;
        this.priority = priority;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                ", user='" + user + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
