package com.example.Calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Value("${num1}")
    private double num1;

    @Value("${num2}")
    private double num2;


    public double add(){
        return num1+num2;
    }

    public double sub(){
        return num1-num2;
    }

    public double mul(){
        return num1*num2;
    }

    public double div(){
        return num1/num2;
    }
}


//    public Calculator(){
//
//    }
//    public double getNum1(){
//        return this.num1;
//    }
//    public void setNum1(double num1){
//
//        this.num1=num1;
//    }
//
//    public double getNum2(){
//
//        return this.num2;
//    }
//    public void setNum2(double num2){
//
//        this.num2=num2;
//    }