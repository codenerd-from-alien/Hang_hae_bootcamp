package org.example;

import java.util.Arrays;

public class ReferenceTypedata {
    public static void main(String[] args){
        String sparata ="Hello sparata";
        System.out.println(sparata);

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5];//string 선언하고 할당 안하면 null
        int[] empty_int = new int[4]; //0으로 할당이 됨
        String[] season = {"봄", "여름", "가을", "겨울"};

        char s ='s';
        System.out.println(s);
        int number =10;
        System.out.println(number);
    }
}
