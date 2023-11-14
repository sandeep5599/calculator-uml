// Author: Sandeep
public class MathOperations {
    private int result;

    public MathOperations() {
        result = 0;
    }// default constructor

    // add
    public void sum(int operand1, int operand2) {
        result = operand1+operand2;
    }

    // subtract
    public void subtract(int operand1, int operand2) {
        result = operand1-operand2;
    }

    // multiply
    public void product(int operand1, int operand2) {
        result = operand1 * operand2;
    }

    // divide
    public void divide(int numerator, int denominator) {
        // Check for division by zero
        if (denominator != 0) {
            result = numerator / denominator;
        } else {
            System.out.println("Error: Division by zero!");
        }
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        // declare two numbers
        int number1 = 72, number2 = 3;

        // instantiate an object of type MathOperations
        MathOperations myCalculator = new MathOperations();

        // perform addition and display the result
        myCalculator.sum(number1,number2);
        System.out.println("Addition Result: " + myCalculator.getResult());

        // perform subtraction and display the result
        myCalculator.subtract(number1,number2);
        System.out.println("Subtraction Result: " + myCalculator.getResult());

        // perform multiplication and display the result
        myCalculator.product(number1, number2);
        System.out.println("Multiplication Result: " + myCalculator.getResult());

        // perform division and display the result
        myCalculator.divide(number1, number2);
        System.out.println("Division Result: " + myCalculator.getResult());
    }
}
