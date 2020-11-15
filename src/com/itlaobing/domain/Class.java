package com.itlaobing.domain;

public class Class {
    private String id;
    private String name;
    private String teacher;

    public Class(String id, String name, String teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
