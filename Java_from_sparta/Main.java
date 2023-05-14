package org.example;


public class Main {
    public static void main(String[] args) {
        int number = 10;
        int result;
        for(int i =10 ;i >=0; i--){
            try{
                result = number /i;
                System.out.println(result);
            }catch (Exception e){
                System.out.println("Exception: " +e.getMessage());
            }finally {
                System.out.println("final always get called");
            }
        }


    }
}