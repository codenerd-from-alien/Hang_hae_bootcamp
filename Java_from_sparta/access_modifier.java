package org.example;

import pkg.ModifierTest; //자바에서는 이 자체를 클래스로 인식함

class  Child extends ModifierTest{
    void callParentProtected(){
        System.out.println("부모 클래스 호출");
        super.messageProtected();
    }
}
public class access_modifier {
    //자바의 접근 제어자 우선 순위
    //좁음()private => default => protected => public(넓음)
    //private은 같은 클래스 내에서만 접근이 가능하다.
    //default 같은 경우에는 패키지 내에서만 접근이 가능하다.
    //protetcted는 같은 패키지나 상속받은 곳에서 사용가능
    public static void main(String[] args){
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
        System.out.println("-----------------------------------");
        Child child = new Child();
        child.callParentProtected();
    }
}
