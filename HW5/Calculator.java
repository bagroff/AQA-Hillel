import java.util.Scanner;

public class Calculator {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        float firstValue = getFloat();
        char operation = getOperation();
        float secondValue = getFloat();
        float result = calculate(firstValue, secondValue, operation);
        System.out.println("Result: " + result);

    }

    public static float getFloat() {
        while (true) {
            System.out.println("Input values that you want to process: ");
            try {
                float number = myScanner.nextFloat();
                return number;
            } catch (Exception wrongValue) {
                System.out.println("Wrong type. Try again.");
                myScanner.nextLine();
            }
        }
    }

    public static char getOperation() {
        System.out.println("Input operation (+, -, *, /): ");
        char operation;
        if (myScanner.hasNext()) {
            operation = myScanner.next().charAt(0);
        } else {
            System.out.println("Wrong operation. Try again.");
            myScanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static float calculate(float firstValue, float secondValue, char operation) {
        float result;
        switch (operation) {
            case '+':
                result = firstValue + secondValue;
                break;
            case '-':
                result = firstValue - secondValue;
                break;
            case '*':
                result = firstValue * secondValue;
                break;
            case '/':
                result = firstValue / secondValue;
                break;
            default:
                System.out.println("Wrong operation. Try again");
                result = calculate(firstValue, secondValue, getOperation());
        }
        return result;
    }
}