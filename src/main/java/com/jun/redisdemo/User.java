package com.jun.redisdemo;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 5631246873493017130L;

    private String name;
    private String id;
    private int age;

    public User(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
