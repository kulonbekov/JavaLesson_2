package com.company;

import com.company.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHello();
        person1.speak();

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 25;
        person2.speak();

    }
}