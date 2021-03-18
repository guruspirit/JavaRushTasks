package com.javarush.task.task21.test;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Philosophers extends Thread{

    private String name;
    private Semaphore sem;
    private boolean full = false;

    public Philosophers(String name,Semaphore sem){
        this.name=name;
        this.sem=sem;
    }

    public void run(){
        try {
            //if (!full) {
            sem.acquire();
            System.out.println(name + " садится за стол");
            int i = new Random().nextInt(10000);//%100;
            Thread.sleep(i);
            full=true;
            System.out.println(name + " поел за " + String.format("%.1f",i/1000.0)  + " сек. Он выходит из-за стола");
            sem.release();
            //Thread.sleep(2000);
            //}
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Integer i = Integer.valueOf("11",2);
        //System.out.println(i);
        Semaphore sem = new Semaphore(2);
        new Philosophers("Сократ",sem).start();
        new Philosophers("Платон",sem).start();
        new Philosophers("Аристотель",sem).start();
        new Philosophers("Фалес",sem).start();
        new Philosophers("Пифагор",sem).start();
    }
}
