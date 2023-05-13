package org.example;
class Phone_1{
    String model;
    String color;
    int price;
    Phone_1(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
public class java_oop_constructor {
    public static void main(String[] args){

        Phone_1 galaxy = new Phone_1("galaxy10", "black", 100);

        System.out.println(galaxy.color + " " + galaxy.model + " " + galaxy.price);


    }
}
