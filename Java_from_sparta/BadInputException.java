package try_catch;

public class BadInputException extends Exception{
    public BadInputException(String type) {
        super("�߸��� �Է��Դϴ�! " + type + "�� �Է����ּ���!");
    }

}
