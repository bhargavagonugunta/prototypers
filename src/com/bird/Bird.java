package com.bird;

import com.birds.Penguin;

public abstract class Bird {
    int age;
    String name;
    String Color;

    public Bird() {
    }

    public Bird(int age, String name, String color) {
        this.age = age;
        this.name = name;
        Color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    void eat(){
        System.out.println("Bird can eat ");
    }
    void sing(){
        System.out.println("Bird can Sing");
    }
}
