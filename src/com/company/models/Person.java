package com.company.models;

import com.company.interfaces.Operation;

public class Person implements Operation {
    private String name;
    private int age;
    //private static int countPeople;


    public Person() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        //countPeople++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Ты ввел некоректный возраст");
        }else{
            this.age = age;
        }

    }
    @Override
    public void getInfo() {
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + age);
        //System.out.println("Описание: " + description);
    }

    /*public static void printNumberOfPeople(){
        System.out.println("Колчество сотрудников в офисе " + countPeople);
    }*/

    @Override
    public String toString() {
        return name + "," + age;
    }


}
