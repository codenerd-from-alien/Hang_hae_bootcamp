package polymorphism;

public class Dog extends AnimalSounds{
    public void Sound(){
        System.out.println("The dog says: bow wow");
    }
    public void Sound(String angry){
        System.out.println("The dog says: growl growl");
        super.Sound(); //부모로 부터 상속을 받으면 부모 함수 참조해서 호출
    }
}
