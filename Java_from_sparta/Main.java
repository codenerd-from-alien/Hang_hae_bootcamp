package try_catch;

public class Main {

    public static void main(String[] args) {
        boolean calculateEnded = false;
         while (!calculateEnded){
            try{
                calculateEnded= CalculatorApp.start();// calapp 클래스 메소드에 접근해서 호출
            }catch (Exception ex){ //
                System.out.println(ex.getMessage());// 만약 위의 함수에서 오류 발생시에 ex함
            }
        }
    }
}
