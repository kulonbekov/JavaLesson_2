package com.company.models;

import com.company.interfaces.Operation;

public class Person implements Operation {
    public String name;
    public int age;

    @Override
    public void speak() {
        System.out.println("Меня зовут " + name + "," + " и мне " + age + " лет");
    }

    @Override
    public void sayHello() {
        System.out.println("Привет!");
    }
}
