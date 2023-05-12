package org.example;

public class Main {
    public static void main(String[] args) {

        short s =1;
        System.out.println(s);
        int a =3;
        System.out.println(a);
        long b =4;
        System.out.println(b);

        float f =5.5F;
        System.out.println(f);

        System.out.println(Short.MAX_VALUE);//쇼트형이 표현 할 수 있는 자료형의 크기
        System.out.println(Short.MIN_VALUE); //max 와 Min 메서드로 자료형의 최대 최소 크기
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        
        char c ='A';
        System.out.println(c);
        //케릭터 할당
        byte data ='d';
        System.out.println(data); //아스키코드 100 출력
            
    }
}