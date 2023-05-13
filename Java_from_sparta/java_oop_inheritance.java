package org.example;

class Animal{
    String name;
    String color;
    public Animal(String name){
        this.name = name;
    }
    public void cry(){
        System.out.println(name +  " crying");
    }
}
//자바에서 상속은 extends 키워드를 이용해서 상속을 받는다.
class Dog extends Animal{
    Dog(String name){
        super(name);//super 키워드를 사용함과 동시에 아래에 정의된 오버라이딩된 함수가 호출이됨
    }

    public void swim(){
        System.out.println(name + " is siwmming.");
    }
    @Override
    public void cry(){
        System.out.println(name + "yallllllll");
    }//오버라이딩한 함수 표기 해주기
    //상속을 받고 있는 dog 클래스는 상위 부모에서 같은 함수는 호출이 되지 않음
    

}

public class java_oop_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("alen");
        dog.cry();
        dog.swim();

        Animal bull_dog = new Dog("iverson");
        bull_dog.cry();
        //bull_dog.swim();   => 상위 부모 클래스를 선언 후에 객체는 자식 클래스의 메소드 호출 불가
        //자바에서는 하나의 클래스만 상속 받음 후에 implementions에서 클래스 불러오는 것 학습
    }

    //함수 오버로딩
    int add(int x, int y , int z){
        return x+y+z;
    }
    int add(int x, int y){
        return x+y;
    }
    long add(int x, int y, long z){
        return x +y +z;
    }




}
