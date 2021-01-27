package ru.eristarion.homework.cowoker;

import java.util.Arrays;

public class Coworker {
    private String name;
    private String surName;
    private String patronymic;
    private String position;
    private String email;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Coworker(String name, String surName, String patronymic, String position, String email, int salary, int age) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Имя: %s\nФамилия: %s\nОтчество: %s\nEmail: %s\nЗарплата: %d\nВозраст: %d", name, surName, patronymic, email, salary, age);
    }

    //test

}
