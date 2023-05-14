class ArrayCalculation {

    int[] arr = { 0, 1, 2, 3, 4 };

    public int divide(int denominatorIndex, int numeratorIndex)
    throws ArithmeticException, ArrayIndexOutOfBoundsException{
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}

public class Quiz {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();

        System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
        // java.lang.ArithmeticException: "/ by zero"
        try{
            System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0));
        }catch (ArithmeticException arthi){
            System.out.println("wrong cal " + arthi);
        }
        try{
            System.out.println("Try to divide using out of index element = "
                    + arrayCalculation.divide(5, 0));
        }catch (ArrayIndexOutOfBoundsException arryindex){
            System.out.println("index out of bound " + arryindex);
        }
    }


}
