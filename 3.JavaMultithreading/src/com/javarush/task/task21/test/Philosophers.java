package com.javarush.task.task21.test;

import java.util.concurrent.Semaphore;

public class Philosophers{


    public static void main(String[] args) {
        //Integer i = Integer.valueOf("11",2);
        //System.out.println(i);
        Semaphore sem = new Semaphore(2);
        new Philosopher("Сократ",sem).start();
        new Philosopher("Платон",sem).start();
        new Philosopher("Аристотель",sem).start();
        new Philosopher("Фалес",sem).start();
        new Philosopher("Пифагор",sem).start();
    }
}
