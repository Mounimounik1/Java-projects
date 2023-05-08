package day4;

import java.util.Scanner;

public class SimpleCalculator {
    enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        Operation operation;
        switch (operator) {
            case '+':
                operation = Operation.ADD;
                break;
            case '-':
                operation = Operation.SUBTRACT;
                break;
            case '*':
                operation = Operation.MULTIPLY;
                break;
            case '/':
                operation = Operation.DIVIDE;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        double result;
        switch (operation) {
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
