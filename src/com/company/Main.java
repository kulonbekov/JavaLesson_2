package com.company;

import com.company.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + "," + " и мне " + person1.age + " лет");

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 25;
        System.out.println("Меня зовут " + person2.name + "," + " и мне " + person2.age + " лет");
    }
}