package com.example.CountBeanApplication;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int age;
    private String name;

    public Person(){
        System.out.println("Person object created");
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void show(){
        System.out.println("Inside show");
    }
}
