package Encapsulationjava;

public class Student {
    private String name;    //이전의 student 클래스와 다르게 
    private int age;    //prviate 키워드로 외부에서 접근이 어렵게 해줌
    private String address;
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){

        return name;
    }
    public int getAge(){

        return age;
    }
    public String getAddress(){
        return address;
    }
    public String toString(){
        return ("Student name is " + this.getName() +
                ", age is: " + this.getAge() + " and address is: "+
                this.getAddress());
    }


    public static void main(String[] args) {
        Student john = new Student("John", 25, "23 East, California");
        System.out.println(john);
    }

}
