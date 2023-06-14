package try_catch;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";
    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception{
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("������");
        }
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));// try���� ���������� ������ �ȴٸ� �Ʒ� �� ����
        return this;
    }
    public Parser parseSecondNum(String secondInput) throws Exception{
// ���� 1.
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("������");
        }

        this.calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }
    public Parser parseOperator(String operationInput) throws Exception{
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("��Ģ ������ ������");
        }
        if(operationInput == "+"){
            this.calculator.setOperation(new AddOperation());
        }else if(operationInput == "-"){
            this.calculator.setOperation(new SubstractOperation());
        }else if(operationInput =="*"){
            this.calculator.setOperation(new MultiplyOperation());
        } else if (operationInput =="/") {
            this.calculator.setOperation(new DivideOperation());
        }
        return this;
    }
    public double executeCalculator() {
        return calculator.calculate();
    }

}
