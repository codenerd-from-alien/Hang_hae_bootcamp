package try_catch;
import java.util.Scanner;
public class CalculatorApp {
    public static boolean start() throws Exception {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ù��° ���ڸ� �Է����ּ���!");
        String firstInput = scanner.nextLine();
        parser.parseFirstNum(firstInput);

        System.out.println("�����ڸ� �Է����ּ���!");
        String operator = scanner.nextLine();
        parser.parseOperator(operator);
        System.out.println("�ι�° ���ڸ� �Է����ּ���!");
        String secondInput = scanner.nextLine();
        parser.parseSecondNum(secondInput);
        System.out.println("���� ��� : " + parser.executeCalculator());
        return true;

    }
}
