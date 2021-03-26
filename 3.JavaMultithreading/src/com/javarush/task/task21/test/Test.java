package com.javarush.task.task21.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.lang.reflect.Field;
import java.util.concurrent.Semaphore;

public class Test {
    public static void analyzeClass(Object o){
        Class cls = o.getClass();
        System.out.println(cls);
        System.out.println("Поля класса" + Arrays.toString(cls.getDeclaredFields()));;
        System.out.println("Родительский класс: " + cls.getSuperclass());
        System.out.println("Методы класса: " + Arrays.toString(cls.getDeclaredMethods()));
        System.out.println("Конструкторы: " + Arrays.toString(cls.getConstructors()));
    }
    public static Cat createCat(){
        Class cls = null;
        Cat cat = null;
        Cat cat2 = new Cat("Musia",2);
        try{
            cls = Class.forName("com.javarush.task.task21.test.Cat");
            cat = (Cat)cls.newInstance();

            cat.setName("Basik-");
            Field age = cls.getDeclaredField("age");
            Method about = cls.getDeclaredMethod("about");
            about.setAccessible(true);
            about.invoke(cat);
            about.invoke(cat2);
            //age.setAccessible(true);
            //age.set(age,6);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return cat;
    }
    public static void main(String[] args) {
        Cat basik = new Cat("Basik",4);
        Cat basik2 = createCat();
        //analyzeClass(basik2);
    }
}
