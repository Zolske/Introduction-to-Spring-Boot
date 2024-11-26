package com.northcoders.demospringbootapp.model;

public class Person {
    String name;
    int age;
    String email;
    String place_of_birth;
    String favourite_food;

    public Person(String name, int age, String email, String place_of_birth, String favourite_food) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.place_of_birth = place_of_birth;
        this.favourite_food = favourite_food;
    }
}
