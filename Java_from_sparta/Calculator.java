package calc;

public class Calculator {
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation,
                      MultiplyOperation multiplyOperation,
                      DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate(String operator, int firstNumber, int SeconNumber){
        double result = 0;
        if(operator.equals("+")){
            result = addOperation.operate(firstNumber , SeconNumber);
        }
        if(operator.equals("-")){
            result = substractOperation.operate(firstNumber , SeconNumber);
        }
        if(operator.equals("*")){
            result =multiplyOperation.operate(firstNumber , SeconNumber);
        }
        if(operator.equals("/")){
            result = divideOperation.operate(firstNumber , SeconNumber);
        }
        return result;
    }


}
