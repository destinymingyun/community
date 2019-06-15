package com.example.demo.entity;

/**
 * 人的身份和对应职业
 */
public class Person {
    private String id;
    private int occupation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", occupation=" + occupation +
                '}';
    }
}
