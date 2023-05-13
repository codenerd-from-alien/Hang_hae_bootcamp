package pkg;

public class ModifierTest {
    private void messageInside(){
        System.out.println("private 호출");
    }

    public void messageOutside(){
        System.out.println("public 호출");
        messageInside(); //private은 같은 클래스 안에서 함수는 접근이 가능해서 호출 가능
    }
    protected void messageProtected(){
        System.out.println("Protected 호출");
    }

    
}
