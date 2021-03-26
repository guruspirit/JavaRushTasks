package com.javarush.task.task21.test;
import com.javarush.task.task21.test.Animal;

class Cat extends Animal{
     int age;
    private String name;

    public Cat(){

    }
    public Cat(String name, int age) {
        this.name=name;
        this.age=age;
    }
    private void about(){
        System.out.println("It is a cat. Its name is "+getName());
    }

}