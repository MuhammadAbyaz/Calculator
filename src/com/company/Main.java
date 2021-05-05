package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operator = 1;
        int firstNumber = 1;
        int secondNumber = 1;
        int result =1;

        while (true){
            System.out.print("Select an operator: ");
            System.out.println();
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.print("(1 - 4): ");
            operator = sc.nextInt();
            if (operator >=1 && operator<=4){
                break;
            }
                System.out.println("Please select a valid value");
        }

        switch (operator){
            case 1:
                operator = '+';
                break;
            case 2:
                operator = '-';
                break;
            case 3:
                operator = '*';
                break;
            case 4:
                operator = '/';
                break;
            default:
                break;
        }

        while (true) {
            System.out.print("Enter first number: ");
            firstNumber = sc.nextInt();
            if (firstNumber >= 1 && firstNumber <= 1000000) {
                break;
            }
            System.out.print("Enter a valid number");
        }

            while (true){
                System.out.print("Enter second number: ");
                secondNumber = sc.nextInt();
                if (secondNumber>=1 && secondNumber<= 1000000){
                    break;
                }
                System.out.print("Enter a valid number");
        }

            if (operator=='+'){
                result = firstNumber+secondNumber;
                System.out.println("Result: " + result);
            }
            else if (operator=='-'){
                result =firstNumber-secondNumber;
                System.out.println("Result: " + result);
            }
            else if (operator=='*') {
                result = firstNumber*secondNumber;
                System.out.println("Result: " + result);
            }
            else {
                result = firstNumber / secondNumber;
                System.out.println("Result: " + (float)result);
        }
    }
}