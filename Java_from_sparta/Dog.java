package polymorphism;

public class Dog extends AnimalSounds{
    public void Sound(){
        System.out.println("The dog says: bow wow");
    }
    public void Sound(String angry){
        System.out.println("The dog says: growl growl");
        super.Sound(); //�θ�� ���� ����� ������ �θ� �Լ� �����ؼ� ȣ��
    }
}
