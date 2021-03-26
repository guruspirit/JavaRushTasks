package com.javarush.task.task21.test;
class Animal{
    private String name;
    private int age;

    public Animal(){

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}