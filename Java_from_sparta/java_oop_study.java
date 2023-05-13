package org.example;

import java.io.StringReader;

class Phone{
    String model;
    String color;
    int price;
}

class Calculations{
    int add(int x, int y){
        return x + y;
    }
    int substract(int x, int y){
        return x -y;
    }
}


public class java_oop_study {
    public static void main(String[] args){
        Phone galaxy = new Phone();
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;


        Phone iphone = new Phone();
        iphone.model = "isPhoneX";
        iphone.color = "Black";
        iphone.price = 200;


        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");

        Calculations calculation = new Calculations();
        int addResult = calculation.add(1,2);
        int subatreactResult = calculation.substract(5,3);
        System.out.println(addResult);
        System.out.println(subatreactResult);


    }
}
